package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.KarlexYan")
@EnableAspectJAutoProxy
public class SpringConfig {
}
