package com.rent.service;

import com.rent.bean.Userinfo;
import com.rent.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    UserinfoMapper userinfoMapper;

    public List<Userinfo> selectAll(){
        return userinfoMapper.selectByExample(null);

    }
}
