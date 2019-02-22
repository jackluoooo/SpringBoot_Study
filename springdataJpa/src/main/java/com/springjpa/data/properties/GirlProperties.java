package com.immoc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author：魏宏东
 * @Param：
 * @description：
 * @Date 2018/8/27 12:49
 **/
@Component
@ConfigurationProperties(prefix="girl")//在配置文件中将girl前缀各种属性映射出来
public class GirlProperties {
    private String cubSize;
    private Integer age;

    public String getCubSize() {
        return cubSize;
    }

    public void setCubSize(String cubSize) {
        this.cubSize = cubSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
