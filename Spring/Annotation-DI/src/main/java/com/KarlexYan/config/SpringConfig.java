package com.KarlexYan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.KarlexYan")
@PropertySource("jdbc.properties")
public class SpringConfig {
}
