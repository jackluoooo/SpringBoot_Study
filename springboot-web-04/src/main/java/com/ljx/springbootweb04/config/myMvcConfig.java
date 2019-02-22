package com.ljx.springbootweb04.config;

import com.ljx.springbootweb04.component.LoginHandler;
import com.ljx.springbootweb04.component.MyLocaleResolver;
import lombok.extern.slf4j.Slf4j;
//import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author：罗金星 date 2019/1/8 22:27
 * 使用WebMvcConfigurer扩展Springmvc
 **/
@Slf4j
@Configuration
public class myMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/welcomeluo").setViewName("success");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }
    @Bean
    public LocaleResolver localeResolver(){
        LocaleResolver localeResolver=new MyLocaleResolver();
//        log.error(((MyLocaleResolver) localeResolver).locale.toString());
        return  localeResolver;
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //SpringBoot已经做好了静态资源映射
//        registry.addInterceptor(new LoginHandler()).addPathPatterns("/**").excludePathPatterns("/index.html","/user/login","/","/asserts/**","/webjars/**");
//    }
}
