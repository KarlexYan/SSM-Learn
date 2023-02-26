package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
// 添加com.KarlexYan.config 以扫到SpringMVCSupport配置类
@ComponentScan({"com.KarlexYan.controller","com.KarlexYan.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
