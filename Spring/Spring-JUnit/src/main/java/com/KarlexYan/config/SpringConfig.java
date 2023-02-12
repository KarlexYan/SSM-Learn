package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.KarlexYan")
@Import({JdbcConfig.class, MyBatisConfig.class})
//@PropertySource：加载类路径jdbc.properties文件
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
