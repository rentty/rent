package com.rent.service.impl;

import com.rent.bean.*;
import com.rent.mapper.*;
import com.rent.service.House_managementService;
import com.rent.service.JSonPool;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Bulk;
import io.searchbox.core.Delete;
import io.searchbox.core.Index;
import io.searchbox.core.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class House_managementServiceImpl implements House_managementService {
    @Autowired
    ExpandMapper expandMapper;

    @Autowired
    HouseMapper houseMapper;

    @Autowired
    HousedlMapper housedlMapper;

    @Autowired
    RentalinfoMapper rentalinfoMapper;

    @Autowired
    UserinfoMapper userinfoMapper;

    @Autowired
    JestClient jestClient;

    @Autowired
    EntrydlMapper entrydlMapper;

    HouseExample houseExample = new HouseExample();
/*    @Override
    public void entryRent_house(House house, String username) {
    int id=0;
    id=expandMapper.selectRgt_IdByUsername(username);
    houseMapper.insertSelective(house);
    Housedl housedl = new Housedl();
    housedl.setHsdId(house.getHsId());
    housedlMapper.insertSelective(housedl);
    Rentalinfo rentalinfo = new Rentalinfo();
    rentalinfo.setRtlfId(house.getHsId());
    rentalinfo.setRtlfHhid(id);
    rentalinfoMapper.insertSelective(rentalinfo);

    }*/

    @Override
    public int entryHouse(House house, Housedl housedl, Rentalinfo rentalinfo, String username) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        rentalinfo.setRtlfReleasetime(date);

        house.setHsStatus(0);
        int i = houseMapper.insertSelective(house);

        housedl.setHsdId(house.getHsId());
        rentalinfo.setRtlfId(house.getHsId());
        int j = housedlMapper.insert(housedl);
        UserinfoExample userinfoExample = new UserinfoExample();
        UserinfoExample.Criteria criteria = userinfoExample.createCriteria();
        criteria.andUifNicknameEqualTo(username);
        List<Userinfo> users = userinfoMapper.selectByExample(userinfoExample);
        rentalinfo.setRtlfHhid(users.get(0).getUifId());
        int k = rentalinfoMapper.insert(rentalinfo);
        if(i == 0 || j == 0 || k == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }




    @Override
    public String getAllHouseByUsername(String username) {
        int id = 0;
        id = expandMapper.selectRgt_IdByUsername(username);
        List<HouseExpand> houseExpands = expandMapper.selectHouseByRgt_Id(id);

        return JSonPool.toJSon(houseExpands);
    }


    @Override
    public int deleteHouse(Integer id) {

        houseMapper.deleteByPrimaryKey(id);
        housedlMapper.deleteByPrimaryKey(id);
        rentalinfoMapper.deleteByPrimaryKey(id);

        Delete delete = new Delete.Builder(id.toString()).index("rent").type("HouseInfo").build();
        try{
            jestClient.execute(delete);

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    @Override
    public int updateHouse(House house, Housedl housedl, Rentalinfo rentalinfo) {
        houseMapper.updateByPrimaryKey(house);
        housedlMapper.updateByPrimaryKey(housedl);
        rentalinfoMapper.updateByPrimaryKey(rentalinfo);

        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setHsId(house.getHsId().longValue());
        houseInfo.setHsArea(house.getHsArea().longValue());
        houseInfo.setHsCity(house.getHsCity());
        houseInfo.setHsdIdoorMAddr(housedl.getHsdIdoormaddr());
        houseInfo.setHsDistrict(house.getHsDistrict());
        houseInfo.setHsHousingEstate(house.getHsHousingestate());
        houseInfo.setHsRent(rentalinfo.getRtlfRent());
        houseInfo.setHsType(house.getHsType().substring(0,2));


        List<String> houseAttrValueList = new ArrayList<>();


        EntrydlExample entrydlExample = new EntrydlExample();
        EntrydlExample.Criteria criteria1 = entrydlExample.createCriteria();
        criteria1.andEdlDetailEqualTo(houseInfo.getHsDistrict());

        EntrydlExample.Criteria criteria2 = entrydlExample.createCriteria();
        criteria2.andEdlDetailEqualTo(houseInfo.getHsType().substring(0,2));
        EntrydlExample.Criteria criteria3 = entrydlExample.createCriteria();
        Long rent = ((long) houseInfo.getHsRent() / 1000);
        Long rentCheck = ((long) houseInfo.getHsRent() / 100);
        int check = (int) (rentCheck % 10);
        Long rent1;
        Long rent2;
        if (check <= 5 && rent > 0 && rent <= 4) {
            rent--;
        }
        if (rent == 0) {
            rent1 = rent * 1000;
            rent2 = rent1 + 1500;
        } else {
            rent1 = rent * 1000 + 500;
            rent2 = rent1 + 1000;
        }

        String hsRent;
        String hsRent1 = rent1.toString();
        String hsRent2 = rent2.toString();

        if (rentCheck > 0 && rentCheck <= 45) {
            hsRent = hsRent1 + "-" + hsRent2;
        } else if (rentCheck > 45 && rentCheck <= 80) {
            hsRent = "4500-8000";
        } else {
            hsRent = "8000以上";
        }

        criteria3.andEdlDetailEqualTo(hsRent);

        entrydlExample.or(criteria2);
        entrydlExample.or(criteria3);
        List<Entrydl> entrydls = entrydlMapper.selectByExample(entrydlExample);


        houseAttrValueList.add("101");
        houseAttrValueList.add("501");
        houseAttrValueList.add("601");
        for (Entrydl entrydl : entrydls) {
            houseAttrValueList.add(entrydl.getEdlId().toString());
        }


        houseInfo.setHouseAttrValueList(houseAttrValueList);

        Update update = new Update.Builder(houseInfo).index("rent").type("HouseInfo").id(String.valueOf(houseInfo.getHsId())).build();

        try {
            jestClient.execute(update);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public List<House> findAllHouse() {

        return houseMapper.selectByExample(null);
    }

    @Override
    public List<Housedl> findAllHousedl() {
        return housedlMapper.selectByExample(null);
    }

    @Override
    public List<House> findAllHouseByStatus(int status) {
        HouseExample.Criteria criteria = houseExample.createCriteria();
        criteria.andHsStatusEqualTo(status);
        return houseMapper.selectByExample(houseExample);
    }

    @Override
    public int changeStatus(int id, int status) {
        House house = new House();
        house.setHsId(id);
        house.setHsStatus(status);
        return houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public List<Rentalinfo> findAllRentalinfo() {
        return rentalinfoMapper.selectByExample(null);
    }

    @Override
    public List<House> findAllHouseWithReview() {

        return houseMapper.selectByExampleWithReview(null);
    }

    @Override
    public int addHouseToEs(int id) {
        House house = houseMapper.selectByPrimaryKey(id);
        Housedl housedl = housedlMapper.selectByPrimaryKey(id);
        Rentalinfo rentalinfo = rentalinfoMapper.selectByPrimaryKey(id);
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setHsId(house.getHsId().longValue());
        houseInfo.setHsArea(house.getHsArea().longValue());
        houseInfo.setHsCity(house.getHsCity());
        houseInfo.setHsdIdoorMAddr(housedl.getHsdIdoormaddr());
        houseInfo.setHsDistrict(house.getHsDistrict());
        houseInfo.setHsHousingEstate(house.getHsHousingestate());
        houseInfo.setHsRent(rentalinfo.getRtlfRent());
        houseInfo.setHsType(house.getHsType().substring(0,2));


        List<String> houseAttrValueList = new ArrayList<>();


        EntrydlExample entrydlExample = new EntrydlExample();
        EntrydlExample.Criteria criteria1 = entrydlExample.createCriteria();
        criteria1.andEdlDetailEqualTo(houseInfo.getHsDistrict());

        EntrydlExample.Criteria criteria2 = entrydlExample.createCriteria();
        criteria2.andEdlDetailEqualTo(houseInfo.getHsType().substring(0,2));
        EntrydlExample.Criteria criteria3 = entrydlExample.createCriteria();
        Long rent = ((long) houseInfo.getHsRent() / 1000);
        Long rentCheck = ((long) houseInfo.getHsRent() / 100);
        int check = (int) (rentCheck % 10);
        Long rent1;
        Long rent2;
        if (check <= 5 && rent > 0 && rent <= 4) {
            rent--;
        }
        if (rent == 0) {
            rent1 = rent * 1000;
            rent2 = rent1 + 1500;
        } else {
            rent1 = rent * 1000 + 500;
            rent2 = rent1 + 1000;
        }

        String hsRent;
        String hsRent1 = rent1.toString();
        String hsRent2 = rent2.toString();

        if (rentCheck > 0 && rentCheck <= 45) {
            hsRent = hsRent1 + "-" + hsRent2;
        } else if (rentCheck > 45 && rentCheck <= 80) {
            hsRent = "4500-8000";
        } else {
            hsRent = "8000以上";
        }

        criteria3.andEdlDetailEqualTo(hsRent);

        entrydlExample.or(criteria2);
        entrydlExample.or(criteria3);
        List<Entrydl> entrydls = entrydlMapper.selectByExample(entrydlExample);


        houseAttrValueList.add("101");
        houseAttrValueList.add("501");
        houseAttrValueList.add("601");
        for (Entrydl entrydl : entrydls) {
            houseAttrValueList.add(entrydl.getEdlId().toString());
        }


        houseInfo.setHouseAttrValueList(houseAttrValueList);


        Bulk.Builder bulk = new Bulk.Builder();
        Index index = new Index.Builder(houseInfo).index("rent").type("HouseInfo").id(String.valueOf(houseInfo.getHsId())).build();
        bulk.addAction(index);

        try {
            jestClient.execute(bulk.build());

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    @Override
    public List<HouseSituation> showHousesByRent() {
        RentalinfoExample example = new RentalinfoExample();
        example.setOrderByClause("rtlf_Rent desc");
        List<Rentalinfo> list = rentalinfoMapper.selectByExample(example);
        List<HouseSituation> list1 = new ArrayList<HouseSituation>();
        for(int i = 0; i < 3; i++) {
            Rentalinfo rentalinfo = list.get(i);
            House house = houseMapper.selectByPrimaryKey(rentalinfo.getRtlfId());
            Housedl housedl = housedlMapper.selectByPrimaryKey(house.getHsId());
            HouseSituation houseSituation = new HouseSituation();
            houseSituation.setHsId(house.getHsId());
            houseSituation.setHsCity(house.getHsCity());

            houseSituation.setHsdFacilityDesc(housedl.getHsdFacilityDesc());
            houseSituation.setHsdldoormaddr(housedl.getHsdIdoormaddr());
            houseSituation.setHsDistrict(house.getHsDistrict());
            houseSituation.setHsTitle(house.getHsHousingestate() + "•" + house.getHsType().substring(0,1) + "居室");
            houseSituation.setRtlfRent(rentalinfo.getRtlfRent());
            System.out.println(houseSituation);
            list1.add(houseSituation);
        }

        return list1;
    }

    @Override
    public List<HouseUser> getAllHouseAndRentById(int id) {
        RentalinfoExample rentalinfoExample = new RentalinfoExample();
        RentalinfoExample.Criteria criteria = rentalinfoExample.createCriteria();
        criteria.andRtlfHhidEqualTo(id);
        List<Rentalinfo> rentalinfoList = rentalinfoMapper.selectByExample(rentalinfoExample);

        int x = rentalinfoList.size();

        List<HouseUser> houseUserList = new ArrayList<>();
        for(int i=0;i<x;i++){
            HouseUser houseUser = new HouseUser();

            houseUser.setRtlfRent(rentalinfoList.get(i).getRtlfRent());
            if(rentalinfoList.get(i).getRtlfRentaltype() == 0){
                houseUser.setRtlfRentaltype("短租");
            }else {
                houseUser.setRtlfRentaltype("长租");
            }
            houseUser.setRtlfRequest(rentalinfoList.get(i).getRtlfRequest());
            houseUser.setRtlfId(rentalinfoList.get(i).getRtlfId());

            House house = houseMapper.selectByPrimaryKey(rentalinfoList.get(i).getRtlfId());
            System.out.println(rentalinfoList.get(i).getRtlfId());
            String str = house.getHsCity() + house.getHsDistrict() + house.getHsHousingestate() + house.getHsAddress();
            houseUser.setAddress(str);
            if(house.getHsStatus() == 0){
                houseUser.setStatus("未审核");
            }else if(house.getHsStatus() == 1){
                houseUser.setStatus("审核通过");
            }else {
                houseUser.setStatus("审核未通过");
            }
            houseUserList.add(houseUser);
        }

        return houseUserList;
    }


}
