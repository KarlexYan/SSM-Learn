package com.KarlexYan.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.KarlexYan")
//开启注解开发AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {
}
