package com.luo.springboot01cache;

import com.luo.springboot01cache.entity.GirlEntity;
import com.luo.springboot01cache.mapper.GirlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01CacheApplicationTests {
    @Autowired
    RedisTemplate<Object,GirlEntity> girlredisTemplate;
    @Autowired
    GirlMapper girlMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;//key-value都是字符串
//    @Autowired
//    RedisTemplate redisTemplate;//key-value都是object

    /**
     * String(字符串),List(列表)，Set(集合)，Hash(散列)，Zset(有序集合)
     */
    @Test
    public void test01(){
//        stringRedisTemplate.opsForValue().append("helloo","helloo");//操作字符串
        String hello = stringRedisTemplate.opsForValue().get("hello");
        System.out.println(hello);
//          stringRedisTemplate.opsForList();
//          stringRedisTemplate.opsForSet();
//          stringRedisTemplate.opsForHash();
//          stringRedisTemplate.opsForZSet();
    }
    @Test
    public void contextLoads() {
        GirlEntity girlEntity = girlMapper.getbyId(1);
//        redisTemplate.opsForValue().set("mygirl",girlEntity);
        girlredisTemplate.opsForValue().set("newgirl",girlEntity);
        System.out.println(girlEntity.toString());

    }

}

