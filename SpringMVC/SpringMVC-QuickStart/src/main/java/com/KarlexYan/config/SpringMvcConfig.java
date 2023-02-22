package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 3. 创建springmvc配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.KarlexYan.controller")
public class SpringMvcConfig {
}
