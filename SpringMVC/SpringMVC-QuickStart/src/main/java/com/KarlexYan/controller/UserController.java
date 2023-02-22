package com.KarlexYan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 2. 定义表现层控制器bean
// 2.1 使用@Controller定义bean
@Controller
public class UserController {
    // 2.2 设置映射路径为/save，即外部访问路径
    @RequestMapping("/save")
    // 2.3 设置当前操作返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module' : 'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module' : 'springmvc'}";
    }
}
