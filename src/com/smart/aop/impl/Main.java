package com.smart.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
    ApplicationContext ctx=new ClassPathXmlApplicationContext("aop_bean_xml.xml");
    ArithmeticCalculator arithmeticCalculator=(ArithmeticCalculator)ctx.getBean("arithmeticCalculator");

    //使用bean,有关联的功能相似的横切关注点可以组成一个切面
    int result=arithmeticCalculator.div(3,1);
    System.out.println("result:"+result);

}}
