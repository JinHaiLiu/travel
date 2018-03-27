package com.travel.basic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.travel.basic.entity.Hotplace;

public interface HotplaceMapper {
    
    Hotplace selectByPrimaryKey(Integer id);
    
    List<Hotplace> selectAll(@Param("sdesc")String sdesc);
    
    List<Hotplace> selectByMonth();

    List<Hotplace> selectByPrice();
}