package com.smart.HelloWord;

public class Car {
    //通过构造器注入
    private String company;
    private String brand;

    private int maxSpeed;
    private float price;

    public Car(String company, String brand, float price) {
        super();
        this.company = company;
        this.brand = brand;
        this.price = price;
    }

    public Car(String company, String brand, int maxSpeed) {
        super();
        this.company = company;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String company, String brand, int maxSpeed, float price) {
        super();
        this.company = company;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public Car(){

    }

    public String toString() {
        return "Car [company=" + company + ", brand=" + brand + ", maxSpeed="
                + maxSpeed + ", price=" + price + "]";
    }

    public static class HelloWorld {
        private String user;
        public HelloWorld(){
            System.out.println("HelloWorld constructor");
        }

        public void setUser(String user) {
            this.user = user;
        }
        public HelloWorld(String user){
            this.user=user;
        }
        public void hello(){
            System.out.println("Hello:"+user);
        }
    }
}
