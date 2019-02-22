package com.luo.springboot05security.config;

import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author：罗金星 date 2019/1/25 16:51
 **/
public class MySecrityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       // super.configure(http);
        //定制请求的授权规则
        http.authorizeRequests().mvcMatchers("/").permitAll();
        http.formLogin();
        http.logout();
    }
}
