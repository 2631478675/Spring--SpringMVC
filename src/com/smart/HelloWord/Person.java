package com.smart.HelloWord;

import com.smart.HelloWord.Car;

import java.util.List;

public class Person {
    //通过属性注入
    private String userName;
    private List<Car> cars;

    private String wifeName;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        System.out.println("setWifhName: " + wifeName);
        this.wifeName = wifeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Person() {
        System.out.println("Person's Construtor...");
    }


    public void to() {
        System.out.println( "User [userName=" + userName + ", cars=" + cars + "]");
    }
}
