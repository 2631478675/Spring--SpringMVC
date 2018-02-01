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
        //方式一:利用ID定位到IOC容器的bean中
        Car car=(Car) cxt.getBean("car");
        //方式二：利用类型返回IOC容器中的bean，但要求IOC容器中必须只能有一个该类型的bean；则一般采用第一种形式
        Car car1= cxt.getBean(Car.class);
   //     Person person=(Person)cxt.getBean("person1");
        Person person1=(Person) cxt.getBean("person2");
        person1.to();
  //      person.to();
    }
}