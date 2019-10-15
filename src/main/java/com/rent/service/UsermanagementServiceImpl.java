package com.rent.service;

import com.rent.bean.*;
import com.rent.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    @Override
    public int Register(Registy registy) {
        RegistyExample example = new RegistyExample();
        example.createCriteria().andRgtUserEqualTo(registy.getRgtUser());
        List<Registy> registies = registyMapper.selectByExample(example);
        System.out.println("长度："+registies.size());
        if(registies.size()>0)
            return -1;//用户已存在

        registyMapper.insertSelective(registy);//以下在用户信息表添加一条记录
        int id = expandMapper.selectRgt_IdByUsername(registy.getRgtUser());
        Userinfo userinfo = new Userinfo(id,null,null,null,null,null);
        userinfoMapper.insertSelective(userinfo);

        return 0;//注册成功

    }

    @Override
    @Cacheable
    public int Login(String username, String password) {
        System.out.println("s");
        RegistyExample example = new RegistyExample();
        List<Registy> registies = null;
        example.createCriteria().andRgtUserEqualTo(username);
        registies = registyMapper.selectByExample(example);
        if(registies.size()<1)
            return -1;//用户不存在
        else {
            if(registies.get(0).getRgtPassword().equals(password))
                return 1;//登录成功
            else
                return 0;//密码错误
        }

    }
    @Override
    @Cacheable(key = "#username",value = "userinfo")
    public String getUserinfo(String username) {
        String result = null;
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        UserinfoExample example1 = new UserinfoExample();
        example1.createCriteria().andUifIdEqualTo(id);
        List<Userinfo> userinfos = userinfoMapper.selectByExample(example1);
        for(Userinfo userinfo:userinfos) {
            result = JSonPool.toJSon(userinfo);
        }
        return result;
    }
    @Override
    @CachePut(key = "#username",value = "userinfo")//key值与查询一样，返回值要么使用传入的对象（完整性），要么从数据库获取-------这里使用参数对象，必须要完整
    public String Motify_userinfo(Userinfo userinfo,String username) {
        int id=0;
      id = expandMapper.selectRgt_IdByUsername(username);
      userinfo.setUifId(id);
    userinfoMapper.updateByPrimaryKeySelective(userinfo);
    return JSonPool.toJSon(userinfo);

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
    public void EntryFavorites(int hs_Id,String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        Favorites favorites = new Favorites(null,id,hs_Id);
        favoritesMapper.insertSelective(favorites);
    }

    @Override
    @Cacheable(key = "#username",value = "Favorites")
    public String getAllFavorites(String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        List<House> favorites = expandMapper.selectAllFavoritesByUif_Id(id);


        return JSonPool.toJSon(favorites);
    }

    @Override

    @CacheEvict(key="#result")
    public String deleteFavoritesByFvr_Id(int fvr_Id) {
        int id=0;
        id=favoritesMapper.selectByPrimaryKey(fvr_Id).getUifId();
        favoritesMapper.deleteByPrimaryKey(fvr_Id);
        Registy registy = registyMapper.selectByPrimaryKey(id);


        return registy.getRgtUser();

    }

}
