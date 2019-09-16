package com.jl.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String name;
    private Dog dog;
    private List<Object> list;
    private Map<String,Object> map;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public List<Object> getList() {
        return list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public Person(String name, Dog dog, List<Object> list, Map<String, Object> map) {
        this.name = name;
        this.dog = dog;
        this.list = list;
        this.map = map;
    }

    public Person() {
    }
}
