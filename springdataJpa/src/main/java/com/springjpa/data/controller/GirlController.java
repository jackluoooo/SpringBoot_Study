package com.immoc.controller;

import com.immoc.damain.Girl;
import com.immoc.repository.GirlResponsitory;
import com.immoc.Service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author：魏宏东
 * @Param：
 * @description：
 * @Date 2018/8/27 16:31
 **/
@RestController
public class GirlController {
    @Autowired
    private GirlResponsitory girlResponsitory;

    @Autowired
    private GirlService girlService;
    @GetMapping(value="/girls")
    public List<Girl> girlList(){
    return girlResponsitory.findAll();
    }
    //添加一个girl
    //@valid 注解限制属性
    @PostMapping(value="/girls")
    public Girl girlAdd(@Valid Girl girl , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
       return girlResponsitory.save(girl);
    }
    //查询一个girl
    @GetMapping(value="/girls/{id}")
  public Girl girlFindOne(@RequestParam("id") Integer id){
         return girlResponsitory.findById(id).orElse(null);}
    //更新
    @PutMapping(value="girls/{id}")
    public Girl girlUpdate(@RequestParam("id") Integer id,
                           @RequestParam("age") Integer age,
                           @RequestParam("cupSize") String cupSize){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlResponsitory.save(girl);
    }
   //删除
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@RequestParam("id") Integer id){
          girlResponsitory.deleteById(id);
    }
    //通过年龄查询女生列表
    @GetMapping(value="girls/age/{age}")
    public List<Girl> girlListById(@PathVariable("age") Integer age){
    return girlResponsitory.findByAge(age);
    }
    @PutMapping(value="girls/two")
    public void girlTwo(){
    girlService.insertTwo();
    }
}

