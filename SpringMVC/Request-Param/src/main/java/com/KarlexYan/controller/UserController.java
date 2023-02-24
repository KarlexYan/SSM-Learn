package com.KarlexYan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("参数传递 name ==> " + name);
        System.out.println("参数传递 age ==> " + age);
        return "{'module' : 'common param'}";
    }
}
