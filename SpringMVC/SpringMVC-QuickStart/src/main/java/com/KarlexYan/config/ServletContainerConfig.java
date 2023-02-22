package com.KarlexYan.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4. 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainerConfig extends AbstractDispatcherServletInitializer {
    // 加载springmvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        ac.register(SpringMvcConfig.class);
        return ac;
    }

    // 设置由springmvc控制器处理的请求映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载spring配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
