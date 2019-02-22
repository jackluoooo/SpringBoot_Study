package com.luo.springboot01cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author：罗金星 date 2019/1/21 13:53
 **/
//@Configuration
public class MycacheConfig {
     @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator(){
        return  new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName()+"["+Arrays.asList(params) +"]";
            }
        };
    }
}
