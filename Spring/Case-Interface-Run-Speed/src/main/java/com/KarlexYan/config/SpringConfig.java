package com.KarlexYan.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.KarlexYan")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
