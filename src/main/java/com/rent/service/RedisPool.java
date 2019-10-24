package com.rent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisPool {
    @Autowired
    RedisTemplate redisTemplate;
    public void updateCache(String key,String value,Object vobject)
    {
        if(key==null)
            key="SimpleKey []";
        redisTemplate.opsForValue().set(value+"::"+key,vobject);
    }
    public void deletesCache(String key,String value)
    {
        if(key==null)
            key="SimpleKey []";
        redisTemplate.delete(value+"::"+key);

    }
}
