package com.luo.springboot04task.controller;

import com.luo.springboot04task.service.AsymcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：罗金星 date 2019/1/25 14:20
 **/
@RestController
public class AsyController {
    @Autowired
    AsymcService asymcService;
    @GetMapping("/hello")
    public String hello(){
      asymcService.hello();
      return  "success";
    }
}

