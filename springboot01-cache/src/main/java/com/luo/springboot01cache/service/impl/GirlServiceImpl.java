package com.luo.springboot01cache.service.impl;

import com.luo.springboot01cache.entity.GirlEntity;
import com.luo.springboot01cache.mapper.GirlMapper;
import com.luo.springboot01cache.service.GirlService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author：罗金星 date 2019/1/21 11:29
 **/
@Service
public class GirlServiceImpl implements GirlService {
    @Resource
    GirlMapper girlMapper;
    /**
     *将方法的运行结果进行缓存
     */
    @Override
    @Cacheable(value = "girlEntity",key = "myKeyGenerator")
    public GirlEntity getGirlById(Integer id) {
        System.out.println("进入查询");
        GirlEntity girlEntity=girlMapper.getbyId(id);
        return girlEntity;
    }
    /**
     * @CachePut:既调用方法，又更新缓存；
     * 修改数据库的某个数据，同时又要更新缓存
     */

    @Override
    @CachePut//先调目标方法，然后将目标结果缓存下来
    public GirlEntity updateGirl(GirlEntity girlEntity) {
        girlMapper.update(girlEntity);
        return  girlEntity;
    }
    /**
     * cache清除，默认在方法执行之前
     */
    @Override
    @CacheEvict(value = "girlEntity",key = "#id")//清除id所对应的girlEntity的那条缓存
    public void delete(Integer id) {
        System.out.println("删咯:"+id);
//        girlMapper.delete(id);
    }
    //@Caching
    //以上三个Cache注解的组合
}
