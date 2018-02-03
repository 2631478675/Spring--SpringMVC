package com.smart.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.
将此类声明称一个切面：把此类放入Ioc容器中
                    使用注解将这个类声明成切面
 */
@Component
@Aspect
public class LoggingAspect {
    /*
    定义此方法，用来声明切入点表达式，一般，该方法中不需要添加其他代码
    步骤：一，使用@Pointcut来声明切入点表达式
          二，后面的其他通知直接使用方法名来引用当前的切入点表达式
     */
    @Pointcut("execution(public int com.smart.aop.impl.ArithmeticCalculator.*(int,int ))")
    public void declareJointPointExperssion(){};

    /*
    2.
    这个方法在哪些类的哪些方法之前执行
    execution(public 返回值 方法名地址(形参))
    execution(public int com.smart.aop.impl.ArithmeticCalculator.add(int,int ))
     */
    /*
    3.
    在Ioc容器中配置AspectJ,使其起作用（作用：为匹配的类生成代理对象）
     */
    @Before("declareJointPointExperssion()")
    //加入参数来检测匹配的方法
    public void beforeMethod(JoinPoint joinPoint){
        //获取匹配的方法名字
        String methodName=joinPoint.getSignature().getName();
        //获取参数值
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("the "+methodName+" begins"+args);
    }
    /*
    无论是否发生异常，后置通知都可以执行
    后置通知还不能访问匹配的方法执行的结果
     */
    @After("declareJointPointExperssion()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" end");
    }
    /*
    返回通知：方法正常结束后执行的通知，可以访问到方法的返回值
    当匹配的方法出现异常则不执行，则访问不到方法的返回值
     */
    @AfterReturning(value="declareJointPointExperssion()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" ends with "+result);
    }
    /*
    异常通知：在目标方法发生异常时执行
    可以访问到异常对象,并跟踪是什么异常
     */
    @AfterThrowing(value="declareJointPointExperssion()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("the "+methodName+" ends with "+ex);
    }
    /*
    环绕通知，不常用

    @Around("execution(public int com.smart.aop.impl.ArithmeticCalculator.*(int,int))")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint){

    } */

}
