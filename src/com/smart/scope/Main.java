package com.smart.scope;

import com.smart.autowrie.Car;
import com.smart.autowrie.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    ApplicationContext cxt=new ClassPathXmlApplicationContext("bean-scope.xml");
    Car car=(Car) cxt.getBean("car");
    Car car1=(Car) cxt.getBean("car");
}
