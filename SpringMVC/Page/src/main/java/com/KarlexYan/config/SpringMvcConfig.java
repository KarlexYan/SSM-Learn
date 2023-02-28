package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.KarlexYan.controller","com.KarlexYan.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
