package com.travel.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.basic.dao.HotplaceMapper;
import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;

/**
 * @author suhu
 */
@Service("hotplaceService")
public class HotplaceServiceImpl implements HotplaceService {

    @Autowired
    private HotplaceMapper hotplaceMapper;

    @Override
    public Hotplace selectByPrimaryKey(Integer id) {
        return hotplaceMapper.selectByPrimaryKey(id);
    }
    
    /* 
     * 查询全部数据
     * 
     * @see com.travel.basic.service.HotplaceService#selectAll()
     */
    @Override
    public List<Hotplace> selectAll(String desc) {
        return hotplaceMapper.selectAll(desc);
    }

    /* 
     * 根据月份查询数据
     * 
     * @see com.travel.basic.service.HotplaceService#selectByMonth(java.lang.String)
     */
    @Override
    public List<Hotplace> selectByMonth() {
        return hotplaceMapper.selectByMonth();
    }

    /* 
     * 根据价格展示数据
     * 
     * @see com.travel.basic.service.HotplaceService#selectByPrice()
     */
    @Override
    public List<Hotplace> selectByPrice() {
        return hotplaceMapper.selectByPrice();
    }

}
