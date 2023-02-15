package com.KarlexYan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.KarlexYan.dao.BookDao.findName(..))")
    private void pt(){}


    //JoinPoint：用于描述切入点的对象，必须配置成通知方法中的第一个参数，可用于获取原始方法调用的参数
//    @Before("pt()")
    public void before(JoinPoint jp){
        // 接收App执行方法时传入的参数，返回值是数组
        Object[] args = jp.getArgs();
        // 将数组转成String类型打印出来
        System.out.println(Arrays.toString(args));
        System.out.println("@Before");
    }

//    @After("pt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("@After");
    }

    //ProceedingJoinPoint：专用于环绕通知，是JoinPoint子类，可以实现对原始方法的调用
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        Object proceed = pjp.proceed(args);
        return proceed;
    }

    //设置返回后通知获取原始方法的返回值，要求returning属性值必须与方法形参名相同
    @AfterReturning(value = "pt()",returning = "obj")
    public void afterReturning(Object obj){
        System.out.println("@AfterReturning " + obj);
    }

    //设置抛出异常后通知获取原始方法运行时抛出的异常对象，要求throwing属性值必须与方法形参名相同
    @AfterThrowing(value = "pt()",throwing = "throwable")
    public void afterThrowing(Throwable throwable){
        System.out.println("@AfterThrowing " + throwable);
    }
}
