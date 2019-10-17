package com.rent.service;

import com.google.gson.Gson;

public class JSonPool {
    public static String toJSon(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
    //JSON转对象,Class<T> clazz对象的
    public static <T> T toObject(String json, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(json, clazz);
    }
}