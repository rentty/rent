package com.rent.service.impl;

import com.rent.bean.House;
import com.rent.bean.HouseExpand;
import com.rent.bean.Housedl;
import com.rent.bean.Rentalinfo;
import com.rent.mapper.ExpandMapper;
import com.rent.mapper.HouseMapper;
import com.rent.mapper.HousedlMapper;
import com.rent.mapper.RentalinfoMapper;
import com.rent.service.House_managementService;
import com.rent.service.JSonPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class House_managementServiceImpl implements House_managementService {
  @Autowired
  ExpandMapper expandMapper;
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
    public void entryHouse(House house, Housedl housedl, Rentalinfo rentalinfo, String username) {

    }

    @Override
    public String getAllHouseByUsername(String username) {
        int id = 0;
               id= expandMapper.selectRgt_IdByUsername(username);
        List<HouseExpand> houseExpands = expandMapper.selectHouseByRgt_Id(id);

        return JSonPool.toJSon(houseExpands);
    }

    @Override
    public void modifyHouse(House house, Housedl housedl, Rentalinfo rentalinfo, String username) {

    }

    @Override
    public void deleteHouse(String hs_Id) {

    }
}
