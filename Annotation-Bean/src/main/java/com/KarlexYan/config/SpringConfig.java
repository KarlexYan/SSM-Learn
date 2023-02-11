package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明当前类为Spring配置类
@Configuration

//@ComponentScan("com.KarlexYan")
//设置bean扫描路径，多个路径书写为字符串数组格式
@ComponentScan({"com.KarlexYan.dao","com.KarlexYan.service"})
public class SpringConfig {
}
