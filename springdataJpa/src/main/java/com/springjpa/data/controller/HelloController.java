package com.immoc.controller;

import com.immoc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author：魏宏东
 * @Param：
 * @description：
 * @Date 2018/8/27 11:01
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
   // @RequestMapping(value="/say" ,method = RequestMethod.GET)
    @GetMapping(value="/say/")
    public String say(@RequestParam(value="id",required = false,defaultValue = "0") Integer id){
        //return "Hello Spring Boot";
        //return  girlProperties.getCubSize();
        return "id:"+id;
    };
}
