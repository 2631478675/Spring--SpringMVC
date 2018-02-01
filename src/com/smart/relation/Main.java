package com.smart.relation;

import com.smart.autowrie.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    ApplicationContext cxt=new ClassPathXmlApplicationContext("bean-relation.xml");
    Address address=(Address) cxt.getBean("address");
    Address address1=(Address) cxt.getBean("address2");
}
