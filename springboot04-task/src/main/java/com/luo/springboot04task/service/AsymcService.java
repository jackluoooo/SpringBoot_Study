package com.luo.springboot04task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author：罗金星 date 2019/1/25 14:18
 **/
@Service
public class AsymcService {
    //告诉Spring这是一个异步方法
    @Async
    public void hello(){
        System.out.println("处理数据中");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
