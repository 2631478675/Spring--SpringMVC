package com.smart.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
    ApplicationContext ctx= new ClassPathXmlApplicationContext("spel_bean.xml");
    Adderss adderss=(Adderss)ctx.getBean("adderss");
    Car car=(Car)ctx.getBean("car");
    Person person=(Person)ctx.getBean("person");
    adderss.print();
    car.print();
    person.print();
}
}