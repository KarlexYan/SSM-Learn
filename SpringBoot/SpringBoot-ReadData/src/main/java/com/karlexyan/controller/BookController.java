package com.karlexyan.controller;

import com.karlexyan.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/books/")
public class BookController {

    //使用@Value读取单一属性数据
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject_00;

    //使用Environment封装全配置数据
    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    private Enterprise enterprise;

    @Autowired
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject_00);
        System.out.println("-------------------------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(environment.getProperty("enterprise.subject[1]"));
        System.out.println("-------------------------------");
        System.out.println(enterprise);
        System.out.println(Arrays.toString(enterprise.getSubject()));
        return "getById for id ==> "+id;

    }
}
