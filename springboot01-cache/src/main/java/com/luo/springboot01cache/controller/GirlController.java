package com.luo.springboot01cache.controller;

import com.luo.springboot01cache.entity.GirlEntity;
import com.luo.springboot01cache.service.GirlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author：罗金星 date 2019/1/21 11:34
 **/
@RestController
public class GirlController {
    @Resource
    GirlService girlService;
    @GetMapping("/getGirl")
    public GirlEntity getGirl(Integer id){
        return  girlService.getGirlById(id);
    }
    @PostMapping("/updateGirl")
    public GirlEntity updateGirl(GirlEntity girl){
        return  girlService.updateGirl(girl);
    }
}
