package com.KarlexYan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.KarlexYan.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(int com.KarlexYan.dao.BookDao.select())")
    private void ptx(){}

    //@Before：前置通知，在原始方法运行之前执行
    @Before("ptx()")
    public void before(){
        System.out.println("@before");
    }

    //@After：后置通知，在原始方法运行之后执行
    @After("ptx()")
    public void after(){
        System.out.println("@after");
    }

    //@Around：环绕通知，在原始方法运行的前后执行
    @Around("pt()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@around before");
        // 表示对原始操作的调用
        proceedingJoinPoint.proceed();
        System.out.println("@around after");
    }

    @Around("ptx()")
    public Object aroundSelect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@around before");
        // 表示对原始操作的调用
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("@around after");
        return ret;
    }

    @AfterReturning("ptx()")
    public void afterReturning(){
        System.out.println("@afterReturning");
    }

    @AfterReturning("ptx()")
    public void afterThrowing(){
        System.out.println("@afterThrowing");
    }
}
