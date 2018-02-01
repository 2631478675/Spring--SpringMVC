package com.smart.properties;

import com.smart.autowrie.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Main {
    ApplicationContext cxt=new ClassPathXmlApplicationContext("bean-properties.xml");
    DataSource dataSource=(DataSource)cxt.getBean("dataSource");
}
