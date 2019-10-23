package com.rent.service.impl;

import com.rent.bean.*;
import com.rent.mapper.*;
import com.rent.service.JSonPool;
import com.rent.service.UsermanagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    //@Cacheable
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
    //@Cacheable(key = "#username",value = "userinfo")
    public Userinfo getUserinfo(int id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Householdinfo getHouseholdinfo(int id) {
        return householdinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    //@CachePut(key = "#username",value = "userinfo")//key值与查询一样，返回值要么使用传入的对象（完整性），要么从数据库获取-------这里使用参数对象，必须要完整
    public int Motify_userinfo(Userinfo userinfo) {

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
    @Cacheable(key = "#username",value = "householdinfo")
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
    @CachePut(key = "#username",value = "householdinfo")
    public String Motify_householdinfo(Householdinfo householdinfo,String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        householdinfo.setHhifId(id);
        householdinfoMapper.updateByPrimaryKeySelective(householdinfo);
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
   // @Cacheable(key = "#username",value = "Favorites")
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

        return favoritesMapper.deleteByPrimaryKey(fvr_Id);

    }

    @Override
    public List<Userinfo> findAllUserinfo() {
        return userinfoMapper.selectByExample(null);
    }

    @Override
    public List<Householdinfo> findAllHouseholdinfo() {

        return householdinfoMapper.selectByExample(null);
    }



}
