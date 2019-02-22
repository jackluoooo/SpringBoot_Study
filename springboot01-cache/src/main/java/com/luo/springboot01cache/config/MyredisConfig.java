package com.luo.springboot01cache.config;

import com.luo.springboot01cache.entity.GirlEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @author：罗金星 date 2019/2/16 14:01
 **/
@Configuration
public class MyredisConfig {

    @Bean
    public RedisTemplate<Object, GirlEntity> girlredisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, GirlEntity> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<GirlEntity> serializer = new Jackson2JsonRedisSerializer<GirlEntity>(GirlEntity.class);
        template.setDefaultSerializer(serializer);
        return template;
    }
}
