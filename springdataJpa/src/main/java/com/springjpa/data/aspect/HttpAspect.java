package com.immoc.aspect;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author：魏宏东
 * @Param：
 * @description：
 * @Date 2018/8/28 16:24
 **/
@Aspect
@Component
public class HttpAspect {
/*    @Before("execution(public * com.immoc.controller.GirlController.girlList(..))")
    public void log(){
 System.out.println(1111111);
    }//面向切面的编程
   @After ("execution(public * com.immoc.controller.GirlController.girlList(..))")
    public void  doAfter(){
        System.out.println(2222222);
    }*/
private final  static Logger logger=LoggerFactory.getLogger(HttpAspect.class);
@Pointcut("execution(public * com.immoc.controller.GirlController.girlList(..))")
    public void log(){

}
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        ServletRequestAttributes attributes= (ServletRequestAttributes )RequestContextHolder.getRequestAttributes();
        javax.servlet.http.HttpServletRequest request=attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURI());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_method={}" ,joinPoint.getSignature().getDeclaringType().getDeclaredClasses()+"."+joinPoint.getSignature().getName());
       //参数
        logger.info("arg={}",joinPoint.getArgs());
}

    @After("log()")
    public void doAfter(){
      //  System.out.println(222222);
        logger.info("222222");}

}
