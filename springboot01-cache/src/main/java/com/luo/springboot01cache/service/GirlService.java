package com.luo.springboot01cache.service;

import com.luo.springboot01cache.entity.GirlEntity;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author：罗金星 date 2019/1/21 11:27
 **/

public interface GirlService {
    GirlEntity getGirlById(Integer id);

    GirlEntity updateGirl(GirlEntity girlEntity);

    void delete(Integer id);
}
