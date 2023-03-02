package com.KarlexYan.config;

import com.KarlexYan.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    private ProjectInterceptor interceptor;

    @Autowired
    public void setInterceptor(ProjectInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    // 放行静态资源
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
    }

    @Override
    // 放行动态资源
    protected void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截器
        registry.addInterceptor(interceptor).addPathPatterns("/books","/books/*");
    }
}
