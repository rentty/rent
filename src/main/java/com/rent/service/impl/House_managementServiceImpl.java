package com.rent.service.impl;

import com.rent.bean.*;
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

  @Autowired
  HouseMapper houseMapper;

  @Autowired
  HousedlMapper housedlMapper;

  @Autowired
  RentalinfoMapper rentalinfoMapper;

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
}
