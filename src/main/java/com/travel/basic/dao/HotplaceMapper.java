package com.travel.basic.dao;

import com.travel.basic.entity.Hotplace;

public interface HotplaceMapper {
    Hotplace selectByPrimaryKey(Integer id);
}