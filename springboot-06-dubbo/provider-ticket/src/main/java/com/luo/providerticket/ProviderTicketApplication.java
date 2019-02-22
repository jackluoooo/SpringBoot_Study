package com.luo.providerticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 将服务提供者注册到注册中心
 */
@SpringBootApplication
//@ComponentScan(basePackages={"cn.com.xxx.dubbo.mail.EDM.*", "com.xxx.autoplateform.*"})
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}

