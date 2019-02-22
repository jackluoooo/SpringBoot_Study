package com.ljx.springboot;


import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author：罗金星 date 2019/1/6 11:39
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLogTest.class)
public class SpringBootLogTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoad() {
        logger.trace("this is trace()");
        logger.debug("this is debug()");
        logger.info("this is info()");
        logger.warn("this is warn()");
        logger.error("this is error()");
    }


}
