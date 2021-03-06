package com.spring.hsk.xunwu.dao;

import com.spring.hsk.xunwu.pojo.House;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}