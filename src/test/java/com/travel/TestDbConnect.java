package com.travel;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/spring-context.xml" })
public class TestDbConnect {

    @Autowired
    private HotplaceService hotplaceService;

    @Test
    public void test() {
//        Hotplace hotplace = hotplaceService.selectByPrimaryKey(117);
        List<Hotplace> all = hotplaceService.selectAll("s_level");
        System.out.println(all);
    }

}
