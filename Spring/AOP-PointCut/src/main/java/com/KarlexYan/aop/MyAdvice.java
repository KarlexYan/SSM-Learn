package com.KarlexYan.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类类
@Aspect
public class MyAdvice {

//    @Pointcut("execution(void com.KarlexYan.dao.BookDao.update())")
//    @Pointcut("execution(void com.KarlexYan.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.KarlexYan.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.*.*.*.*.update())")
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(void *..update())")

    //执行com.KarlexYan包下的任意包下的名称以Service结尾的类或接口中的save方法，参数任意，返回值任意
    @Pointcut("execution(* com.KarlexYan.*.*Service.save(..))")
    private void pt(){}


    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
