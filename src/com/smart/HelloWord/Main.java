package com.smart.HelloWord;

import com.smart.HelloWord.Car;
import com.smart.HelloWord.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]) {
        //创建容器
        //ClassPathXmlApplicationContext是ApplicationContext接口的实现类
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");

        /*1.容器已经实例化

          2.前提bean已经配置到了Ioc容器中
          3.从Ioc容器中获取bean
          4.getBean()方法在BeanFactroy中
        */
        /*注入方式：1.通过属性（Setter）注入
            2.通过构造器注入，（要求必须含有对应的构造器）
        */
        Car.HelloWorld helloWorld = (Car.HelloWorld) cxt.getBean("heii");
        //相应的在Ioc容器中配置bean(helloWorld1)
        Car.HelloWorld helloWorld1=(Car.HelloWorld) cxt.getBean("heoo");
        Car.HelloWorld helloWorld2=(Car.HelloWorld) cxt.getBean("hell");
        helloWorld.hello();
        helloWorld1.hello();
        helloWorld2.hello();
        Car car=(Car) cxt.getBean("car");
        Car car1=(Car) cxt.getBean("car1");
   //     Person person=(Person)cxt.getBean("person1");
        Person person1=(Person) cxt.getBean("person2");
        person1.to();
  //      person.to();
    }
}