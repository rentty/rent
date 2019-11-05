package com.rent.service.impl;

import com.rent.bean.House;
import com.rent.bean.Housedl;
import com.rent.bean.Rentalinfo;
import com.rent.bean.showHousedl;
import com.rent.mapper.HouseMapper;
import com.rent.mapper.HousedlMapper;
import com.rent.mapper.RentalinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class showHousedlM {

    @Autowired
    HouseMapper houseMapper;
    @Autowired
    RentalinfoMapper rentalinfoMapper;
    @Autowired
    HousedlMapper housedlMapper;


    public showHousedl getByhsId(Integer hsId){
        showHousedl show = new showHousedl();

        House house = houseMapper.selectByPrimaryKey(hsId);
        show.setTitle(house.getHsDistrict()+house.getHsHousingestate());
        show.setHsType(house.getHsType());

        show.setHsAddress(house.getHsAddress());
        show.setHsLayer(house.getHsLayer());
        show.setHsOriented(house.getHsOriented());
        show.setHsArea(house.getHsArea());

        Rentalinfo rntalinfo = rentalinfoMapper.selectByPrimaryKey(hsId);
        show.setRtlfReleasetime(rntalinfo.getRtlfReleasetime());
        show.setRent(rntalinfo.getRtlfRent());


        return show;
    }
    public Housedl getPicbyhsId(Integer hsId) {
        Housedl housedl= new Housedl();

        housedl = housedlMapper.selectByPrimaryKey(hsId);


        return housedl;
    }
}
