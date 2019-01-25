package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.domain.City;

@Mapper
public interface CityDao {
    /**
     * 根据城市名查找城市信息
     *
     * @param cityName
     * @return
     */
    @Select("select * from city where city.city_name = #{cityName}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
}
