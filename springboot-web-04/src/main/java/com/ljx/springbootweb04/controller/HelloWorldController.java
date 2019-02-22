package com.ljx.springbootweb04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author：罗金星 date 2019/1/7 9:55
 **/

@Controller
public class HelloWorldController {
//    @RequestMapping({"/","index.html"})
//    public String welcome(){
//        return "index";
//    }

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        return  "hello";
    }
    //内嵌Thymeleaf模板
    @RequestMapping(value = "/success")
    public String success(Map<String,String> map){
        map.put("hello","你好");
        return  "success";
    }
}
