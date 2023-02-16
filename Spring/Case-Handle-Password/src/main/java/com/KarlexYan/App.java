package com.KarlexYan;

import com.KarlexYan.config.SpringConfig;
import com.KarlexYan.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ac.getBean(ResourcesService.class);
        boolean flag = resourcesService.openURL("http://pan.baidu.com/s/thisstringistesturl", "root ");
        System.out.println(flag);
    }
}
