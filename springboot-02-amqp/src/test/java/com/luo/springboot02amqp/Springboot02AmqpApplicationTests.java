package com.luo.springboot02amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {
        /**
         * 需要自定义消息内容和消息头
         */
//        rabbitTemplate.send(exchange,routeKey,message);
        //
        /**
         * Object(默认当成消息体)自动序列化发给rabbitmq
         */
//        rabbitTemplate.convertAndSend(exchange,routeKey,object);
        rabbitTemplate.convertAndSend("" );
    }

}

