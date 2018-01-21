package com.smart.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.List;

public class LoggingAspectJxml {
    //加入参数来检测匹配的方法
    public void beforeMethod(JoinPoint joinPoint){
        //获取匹配的方法名字
        String methodName=joinPoint.getSignature().getName();
        //获取参数值
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("the "+methodName+" begins"+args);
    }
    public void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" end");
    }

    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" ends with "+result);
    }

    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" ends with "+ex);
    }
}
