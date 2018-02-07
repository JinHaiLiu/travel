package com.travel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;

/**
 * @author liujh
 */
@Controller
@RequestMapping("/travel")
public class HotplaceController {
    
    @Autowired
    private HotplaceService hotplaceService;
    

    /**
     * 查询数据
     * 
     * 后面将查询数据已json格式返回前端。 目前是测试，返回指定页面
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model, HttpServletRequest request, HttpServletResponse response) {
        try {
            // TEST 查询数据
            Hotplace hotplace = hotplaceService.selectByPrimaryKey(117);
            // 数据返回前端
            model.addAttribute("hotplace", hotplace);
            
            return "hotplace";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
