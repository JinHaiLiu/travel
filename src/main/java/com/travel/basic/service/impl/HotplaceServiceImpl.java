package com.travel.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.basic.dao.HotplaceMapper;
import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;

/**
 * @author liujh
 */
@Service("hotplaceService")
public class HotplaceServiceImpl implements HotplaceService {

    @Autowired
    private HotplaceMapper hotplaceMapper;

    @Override
    public Hotplace selectByPrimaryKey(Integer id) {
        return hotplaceMapper.selectByPrimaryKey(id);
    }

}
