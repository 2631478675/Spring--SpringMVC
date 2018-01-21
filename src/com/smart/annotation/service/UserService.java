package com.smart.annotation.service;

import com.smart.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    //此时是UserRepository加入了Ioc容器中，如果没加入的话
    //则要写成@Autowired（required=false）
    /*
    如果UserRepository接口含有多个实现类，则需要注明
    @Qualifier（"userRepositoryImpl"）
    也可以将其加入到setter方法的形参前面
     */
    private UserRepository userRepository;
    public void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }
}
