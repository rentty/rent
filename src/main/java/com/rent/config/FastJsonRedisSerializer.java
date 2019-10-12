package com.rent.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;

public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Class<T> clazz;
    static {
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Dialog");//反序列化，一个个添加对象-----------------------------------------------
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Entrydl");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Favorites");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.House");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Housedl");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Householdinfo");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Housenum");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Order");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Registy");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Rentalinfo");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Review");
        ParserConfig.getGlobalInstance().addAccept("com.rent.bean.Userinfo");

    }
    public FastJsonRedisSerializer(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public byte[] serialize(T t) throws SerializationException {
        if (null == t) {
            return new byte[0];
        }
        return JSON.toJSONString(t, SerializerFeature.WriteClassName).getBytes(DEFAULT_CHARSET);
    }

    @Override
    public T deserialize(byte[] bytes) throws SerializationException {
        if (null == bytes || bytes.length <= 0) {
            return null;
        }
        String str = new String(bytes, DEFAULT_CHARSET);
        return (T) JSON.parseObject(str, clazz);
    }

}