package com.smart.spel;

public class Person {
    private String name;
    private Car car;
    //引用address bean的city属性
    private String city;
    //根据car的price来判定info：price>300000,金领，否则白领
    private String info;


    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public String getInfo() {
        return info;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void print() {
        System.out.println("name="+name+",car="+car+",city="+city+",info="+info);
    }
}
