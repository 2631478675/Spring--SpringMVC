package com.smart.autowrie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    ApplicationContext cxt=new ClassPathXmlApplicationContext("bean-autowire.xml");
    Person person=(Person) cxt.getBean("person");
}
