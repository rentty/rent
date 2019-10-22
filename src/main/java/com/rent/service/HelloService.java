package com.rent.service;

import com.rent.bean.Userinfo;
import com.rent.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheManager = "cacheManager")
public class HelloService {

    @Autowired
    UserinfoMapper userinfoMapper;
    @Autowired
    RedisPool redisPool;

    public List<Userinfo> selectAll(){
        return userinfoMapper.selectByExample(null);

    }
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Cacheable(key ="#key",value = "test")
    public String test(int key,String username)
    {
        //redisTemplate.delete("k1");

        return "ok";
    }

    @Cacheable(value = "alltest")
    public String alltest()
    {
        return "okall";
    }
    public String update(int key,String value)
    {

        redisPool.deletesCache(String.valueOf(key),value);
        System.out.println("***********************");
        return "ok";
    }
  /*  public void updateCache(int key)
    {
        redisTemplate.delete("test::"+key);
        redisTemplate.delete("alltest::SimpleKey []");
    }*/


}
