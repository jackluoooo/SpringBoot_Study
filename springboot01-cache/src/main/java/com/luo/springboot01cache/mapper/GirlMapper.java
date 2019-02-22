package com.luo.springboot01cache.mapper;

import com.luo.springboot01cache.entity.GirlEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author：罗金星 date 2019/1/21 10:50
 **/
@Mapper
public interface GirlMapper {
    @Select("select * from girl where id =#{id}")
    GirlEntity getbyId(Integer id);

    @Update("update girl set age=#{girl.age},cupsize=#{girl.cupsize},money=#{girl.money} where id=#{girl.id}")
    int update(GirlEntity girl);

    @Delete("delete from girl where id=#{id}")
    int delete(Integer id);
}
