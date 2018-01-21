package com.smart.annotation;

import com.smart.annotation.controller.UserController;
import com.smart.annotation.repository.UserRepository;
import com.smart.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){
        ApplicationContext cxt=new ClassPathXmlApplicationContext("annotation.xml");

    /*    TestObject testObject=(TestObject)cxt.getBean("testObject");
        System.out.println(testObject);

        UserService userService=(UserService) cxt.getBean("userService");
        System.out.println(userService);




        UserRepository userRepository=(UserRepository)cxt.getBean("userRepository");
        System.out.println(userRepository);*/

        UserController userController=(UserController)cxt.getBean("userController");
        System.out.println(userController);

    }
}
