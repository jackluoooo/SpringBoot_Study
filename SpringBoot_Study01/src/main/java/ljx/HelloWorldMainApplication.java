package ljx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author：罗金星 date 2019/1/1 22:12
 * @SpringBootApplication 说明这是主程序
 **/
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring boot 应用启动
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}

