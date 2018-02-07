package com.travel.basic.service;

import com.travel.basic.entity.Hotplace;

/**
 * @author liujh
 */
public interface HotplaceService {

    /**
     * 根据ID查询数据
     * @param id
     * @return
     */
    Hotplace selectByPrimaryKey(Integer id);

}
