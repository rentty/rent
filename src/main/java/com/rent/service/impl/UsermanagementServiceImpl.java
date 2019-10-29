package com.rent.service.impl;

import com.rent.bean.*;
import com.rent.mapper.*;
import com.rent.service.JSonPool;
import com.rent.service.RedisPool;
import com.rent.service.UsermanagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@CacheConfig(cacheNames = "UsermanagementService",cacheManager = "cacheManager")
@Service
public class UsermanagementServiceImpl implements UsermanagementService {
    @Autowired
    ExpandMapper expandMapper;
    @Autowired
    RegistyMapper registyMapper;
    @Autowired
    UserinfoMapper userinfoMapper;
    @Autowired
    HouseholdinfoMapper householdinfoMapper;
    @Autowired
    FavoritesMapper favoritesMapper;
    @Autowired
    HousedlMapper housedlMapper;
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    RentalinfoMapper rentalinfoMapper;
    @Autowired
    RedisPool redisPool;
    @Override
    public int Register(Registy registy) {
        if(registy.getRgtId() != null){
            RegistyExample registyExample = new RegistyExample();
            registyExample.createCriteria().andRgtIdEqualTo(registy.getRgtId());
            if(registyMapper.selectByExample(registyExample).size() > 0){
                return 0;
            }
        }

        if( registyMapper.insert(registy) != 1){
            return -1;
        }
        Userinfo userinfo = new Userinfo(registy.getRgtId(),null,null,null,null,null);
        if(userinfoMapper.insertSelective(userinfo) != 1){
            rentalinfoMapper.deleteByPrimaryKey(registy.getRgtId());
            return -2;
        }
        return 1;//注册成功

    }

    @Override
    @Cacheable(key = "#username+'~'+#password",value = "userLogin")
    public HashMap Login(String username, String password) {
        //System.out.println("s");
        HashMap map = new HashMap();
        RegistyExample example = new RegistyExample();
        List<Registy> registies = null;
        example.createCriteria().andRgtUserEqualTo(username);
        registies = registyMapper.selectByExample(example);
        if(registies.size()<1) {
            map.put("status", -1);
            return map;//用户不存在
        }
        else{
            if(registies.get(0).getRgtPassword().equals(password)){
                Householdinfo householdinfo = householdinfoMapper.selectByPrimaryKey(registies.get(0).getRgtId());
                if(householdinfo != null){
                    map.put("status",11);
                    map.put("user",userinfoMapper.selectByPrimaryKey(registies.get(0).getRgtId()));
                    return map;//登录成功 户主
                }else {
                    map.put("status",12);
                    map.put("user",userinfoMapper.selectByPrimaryKey(registies.get(0).getRgtId()));
                    return map;//登录成功 普通用户
                }

            }
            else{
                map.put("status",0);
                return map;//密码错误
            }

        }

    }
    @Override
   @Cacheable(key = "#id",value = "getUserinfo")
    public Userinfo getUserinfo(int id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable(key = "#id",value = "getHouseholdinfo")
    public Householdinfo getHouseholdinfo(int id) {
        return householdinfoMapper.selectByPrimaryKey(id);
    }

    @Override

    public int Motify_userinfo(Userinfo userinfo) {
        //更新缓存-----------twj
      redisPool.updateCache(String.valueOf(userinfo.getUifId()),"getUserinfo",userinfo);//更新getUserinfo的缓存
        redisPool.deletesCache(null,"findAllUserinfo");//删除findAllUserinfo缓存
        //更新缓存-------twj
        return userinfoMapper.updateByPrimaryKey(userinfo);
    }



    @Override
    public void Entry_householdinfo(Householdinfo householdinfo,String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        householdinfo.setHhifId(id);
        householdinfoMapper.insertSelective(householdinfo);


    }
    @Override
    @Cacheable(key = "#username",value = "getHouseholdinfoByUsername")
    public String getHouseholdinfoByUsername(String username) {
        String result = null;
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        HouseholdinfoExample example1 = new HouseholdinfoExample();
        example1.createCriteria().andHhifIdEqualTo(id);
        List<Householdinfo> householdinfos = householdinfoMapper.selectByExample(example1);
        for(Householdinfo householdinfo:householdinfos)
            result = JSonPool.toJSon(householdinfo);

        return result;
    }

    @Override
    public String Motify_householdinfo(Householdinfo householdinfo,String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        householdinfo.setHhifId(id);
        householdinfoMapper.updateByPrimaryKeySelective(householdinfo);
        //更新缓存---------twj
        Householdinfo householdinfo1 = householdinfoMapper.selectByPrimaryKey(id);
        redisPool.updateCache(String.valueOf(id),"getHouseholdinfo",householdinfo1);
        redisPool.updateCache(username,"getHouseholdinfoByUsername",JSonPool.toJSon(householdinfo1));//---------------------------------------------------
        redisPool.deletesCache(null,"findAllHouseholdinfo");//删除findAllUserinfo缓存
        //更新缓存-------twj

        return JSonPool.toJSon(householdinfo);

    }


    @Override
    public int EntryFavorites(int hs_Id,int uif_Id) {

        Favorites favorites = new Favorites(null,uif_Id,hs_Id);
        FavoritesExample favoritesExample = new FavoritesExample();
        favoritesExample.createCriteria().andUifIdEqualTo(uif_Id);
        favoritesExample.createCriteria().andHsIdEqualTo(hs_Id);
        if( favoritesMapper.selectByExample(favoritesExample).size()>0){
            return -1;
        }
        return favoritesMapper.insert(favorites);
    }

    @Override
    @Cacheable(key = "#id",value = "getAllFavorites")
    public List<ShowHouse> getAllFavorites(int id) {
        List<ShowHouse> list = new ArrayList<ShowHouse>();
        UserinfoExample userinfoExample = new UserinfoExample();
        userinfoExample.createCriteria().andUifIdEqualTo(id);
        List<Userinfo> list1 = userinfoMapper.selectByExampleWithFavor(userinfoExample);
        //System.out.println(list1.size());
        Userinfo userinfo = list1.get(0);
        for(int i=0;i<userinfo.getFavorites().size();i++){
            ShowHouse showHouse = new ShowHouse();
            showHouse.setFvrId(userinfo.getFavorites().get(i).getFvrId());
            Housedl housedl = housedlMapper.selectByPrimaryKey(userinfo.getFavorites().get(i).getHsId());
            System.out.println(housedl);
            showHouse.setHsdldoormaddr(housedl.getHsdIdoormaddr());
            showHouse.setHsdFacilityDesc(housedl.getHsdFacilityDesc());
            House house = houseMapper.selectByPrimaryKey(userinfo.getFavorites().get(i).getHsId());
            System.out.println(house);
            showHouse.setHsCity(house.getHsCity());
            showHouse.setHsDistrict(house.getHsDistrict());
            showHouse.setHsHousingestate(house.getHsHousingestate());
            showHouse.setHsType(house.getHsType());
            Rentalinfo rentalinfo = rentalinfoMapper.selectByPrimaryKey(userinfo.getFavorites().get(i).getHsId());
            System.out.println(rentalinfo);
            showHouse.setRtlfRent(rentalinfo.getRtlfRent());
            System.out.println(showHouse);
            list.add(showHouse);
        }
        /*FavoritesExample favoritesExample = new FavoritesExample();
        favoritesExample.createCriteria().andUifIdEqualTo(id);
        List<Favorites> favorites = favoritesMapper.selectByExample(favoritesExample);
        for(int i=0;i<favorites.size();i++){

        }*/

        return list;
    }

    @Override

    //@CacheEvict(key="#result",value = "Favorites")
    public int deleteFavoritesByFvr_Id(int fvr_Id) {
        //更新缓存-------twj
        Favorites favorites = favoritesMapper.selectByPrimaryKey(fvr_Id);
        Integer uifId = favorites.getUifId();
        redisPool.deletesCache(String.valueOf(uifId),"getAllFavorites");
        //更新缓存-------twj
        return favoritesMapper.deleteByPrimaryKey(fvr_Id);

    }

    @Override
    @Cacheable(value = "findAllUserinfo")
    public List<Userinfo> findAllUserinfo() {
        return userinfoMapper.selectByExample(null);
    }

    @Override
    @Cacheable(value = "findAllHouseholdinfo")
    public List<Householdinfo> findAllHouseholdinfo() {

        return householdinfoMapper.selectByExample(null);
    }

    @Override
    public List<MapHouse> findAllHouseAndRent(String type,String ori,int area1,int area2,int layer,
                                              int rent1,int rent2,int renttype) {

        HouseExample houseExample = new HouseExample();
        HouseExample.Criteria criteria = houseExample.createCriteria();
        if(!type.equals("-1")){
            criteria.andHsTypeEqualTo(type);
        }
        if(!ori.equals("-1")){
            criteria.andHsOrientedEqualTo(ori);
        }
        if(area1 != -1){
            criteria.andHsAreaBetween(area1,area2);
        }
        if(layer != -1){
            criteria.andHsLayerEqualTo(layer);
        }
        List<House> houseList = houseMapper.selectByExample(houseExample);
        //System.out.println(houseList);

        RentalinfoExample rentalinfoExample = new RentalinfoExample();
        RentalinfoExample.Criteria criteria1 = rentalinfoExample.createCriteria();
        if(renttype != -1){
            criteria1.andRtlfRentaltypeEqualTo(renttype);
        }
        if(rent1 != -1){
            criteria1.andRtlfRentBetween(rent1,rent2);
        }
        List<Rentalinfo> rentalinfoList = rentalinfoMapper.selectByExample(rentalinfoExample);
        //System.out.println(rentalinfoList);

        List<Integer> houseIds=new ArrayList<Integer>();
        for(int i=0;i< houseList.size();i++){
            houseIds.add(houseList.get(i).getHsId());
        }
        System.out.println(houseIds);

        List<Integer> RentIds=new ArrayList<Integer>();
        for(int i=0;i< rentalinfoList.size();i++){
            RentIds.add(rentalinfoList.get(i).getRtlfId());
        }
        System.out.println(RentIds);

        Collection exists=new ArrayList<Integer>(houseIds);
        Collection notexists=new ArrayList<Integer>(houseIds);

        exists.removeAll(RentIds);
        notexists.removeAll(exists);
        System.out.println(notexists);//notexists即RentIds和houseIds的交集

        List<Integer> list = (List<Integer>) notexists;
        //System.out.println(list);

        List<MapHouse> mapHouseList = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            MapHouse mapHouse = new MapHouse();

            House house = new House();
            for(int j = 0;j < houseList.size() ;j++){
                if(houseList.get(j).getHsId() == list.get(i)){
                    house = houseList.get(j);
                    //break;
                }
            }
            mapHouse.setHsId(house.getHsId());
            mapHouse.setHsType(house.getHsType());
            mapHouse.setHsArea(house.getHsArea());
            mapHouse.setHsCity(house.getHsCity());
            mapHouse.setHsDistrict(house.getHsDistrict());
            mapHouse.setHsHousingestate(house.getHsHousingestate());
            mapHouse.setHsAddress(house.getHsAddress());
            mapHouse.setHsLayer(house.getHsLayer());
            mapHouse.setHsOriented(house.getHsOriented());
            mapHouse.setHsLongitude(house.getHsLongitude());
            mapHouse.setHsLatitude(house.getHsLatitude());

            Rentalinfo rentalinfo = new Rentalinfo();
            for(int j = 0;j < rentalinfoList.size() ;j++){
                if(rentalinfoList.get(j).getRtlfId() == list.get(i)){
                    rentalinfo = rentalinfoList.get(j);
                    break;
                }
            }
            mapHouse.setRtlfRentaltype(rentalinfo.getRtlfRentaltype());
            mapHouse.setRtlfRent(rentalinfo.getRtlfRent());
            mapHouse.setRtlfHhid(rentalinfo.getRtlfHhid());
            mapHouse.setRtlfRequest(rentalinfo.getRtlfRequest());
            mapHouseList.add(mapHouse);
            //System.out.println("dd");
        }

        return mapHouseList;
    }

    /*
   @Cacheable(key = "#username+'~'+#password",value = "userLogin")
    public HashMap Login(String username, String password)
 @Cacheable(key = "#id",value = "getUserinfo")
    public Userinfo getUserinfo(int id)
  @Cacheable(key = "#id",value = "getHouseholdinfo")
    public Householdinfo getHouseholdinfo(int id)
 @Cacheable(key = "#username",value = "getHouseholdinfoByUsername")
    public String getHouseholdinfoByUsername(String username)
 @Cacheable(key = "#id",value = "getAllFavorites")
    public List<ShowHouse> getAllFavorites(int id)
  @Cacheable(value = "findAllUserinfo")
    public List<Userinfo> findAllUserinfo()
 @Cacheable(value = "findAllHouseholdinfo")
    public List<Householdinfo> findAllHouseholdinfo()
     */





}
