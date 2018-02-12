package com.travel.basic.service;

import java.util.List;

import com.travel.basic.entity.Hotplace;

/**
 * @author suhu
 */
public interface HotplaceService {

    /**
     * 根据ID查询数据
     * 
     * @param id
     * @return
     */
    Hotplace selectByPrimaryKey(Integer id);
    
    /**
     * 查询全部数据
     * 
     * @return
     */
    List<Hotplace> selectAll();

}
