package com.KarlexYan.apo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.KarlexYan.service.*Service.*(*,*))")
    private void pt(){}

    @Around("DataAdvice.pt()")
    public Object TrimStr(ProceedingJoinPoint pjp) throws Throwable {
//        Object[] args = pjp.getArgs();
//        String url = args[0].toString();
//        String password = args[1].toString().trim();
//        args[0] = url;
//        args[1] = password;
//        Object ret = pjp.proceed(args);
        Object[] args = pjp.getArgs();
        // 对原始参数每一个参数进行操作
        for (int i = 0; i < args.length; i++) {
            // 如果是字符串数据
            if (args[i].getClass().equals(String.class)){
                // 取出数据,trim()操作后，更新数据
                args[i] = args[i].toString().trim();
            }
        }
        // 执行原操作，将更新后的数据args传入
        Object ret = pjp.proceed(args);
        return ret;
    }
}
