package com.smart.spel;

public class Adderss {
    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public void print() {
        System.out.println("city="+city+",street="+street);
    }
}
