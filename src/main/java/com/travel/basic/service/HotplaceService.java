package com.travel.basic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
     * @param month
     * @param desc
     * @return
     */
    List<Hotplace> selectAll(String month,String desc);
    
    /**
     * 根据月份查询数据
     * 
     * @return
     */
    List<Hotplace> selectByMonth();

    /**
     * 根据价格展示诗句
     * 
     * @return
     */
    List<Hotplace> selectByPrice();
    
    /**
     * 查询月份
     * 
     * @return
     */
    List<String> getMonth();


}
