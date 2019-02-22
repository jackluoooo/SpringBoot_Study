package com.luo.comsumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author：罗金星 date 2019/1/31 14:49
 **/
@RestController
public class UserController  {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buy(String name){
        String forObject = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+"购买了："+forObject;
    }
}
