package com.myspringboot.springbootdata.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author：罗金星 date 2019/1/18 12:55
 **/
@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix ="spring.datasource" )
    @Bean
    public DruidDataSource druid(){
        return  new DruidDataSource();
    }
    //配置Druid监控
    //1.配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> initParams=new HashMap<>();

        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","12345");
        initParams.put("allow","");//默认允许所访问
        bean.setInitParameters(initParams);
        return  bean;
    }
    //2.配一个filetr
    @Bean
    public FilterRegistrationBean webstatFilter(){
        FilterRegistrationBean bean=new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams=new HashMap<>();
        initParams.put("execlusion","*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return  bean;
    }
}
