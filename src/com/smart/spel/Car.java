package com.smart.spel;

public class Car {
    private String brand;
    private double price;
    //轮胎周长
    private double tyrePerimeter;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getTyrePerimeter() {
        return tyrePerimeter;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTyrePerimeter(double tyrePerimeter) {
        this.tyrePerimeter = tyrePerimeter;
    }
    public void print() {
        System.out.println("brand="+brand+",price="+price+",tyrePerimeter="+tyrePerimeter);
    }
}
