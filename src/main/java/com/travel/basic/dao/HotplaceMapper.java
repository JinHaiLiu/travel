package com.travel.basic.dao;

import java.util.List;

import com.travel.basic.entity.Hotplace;

public interface HotplaceMapper {
    Hotplace selectByPrimaryKey(Integer id);
    
    List<Hotplace> selectAll();
}