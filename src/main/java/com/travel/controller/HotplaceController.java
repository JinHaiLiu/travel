package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;

/**
 * @author suhu
 */
@Controller
//@RequestMapping("/travel")
public class HotplaceController {
    
    @Autowired
    private HotplaceService hotplaceService;
    
    /**
     * 查询全部数据返回至前端
     * 
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/all")
    public String getAll(Model model, HttpServletRequest request, HttpServletResponse response) {
        try {
            
            List<Hotplace> all = hotplaceService.selectAll(null);
            
            model.addAttribute("all", all);
            
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
       
    }
    
    /**
     * 查询全部数据返回至前端
     * 排序查询使用
     * 
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/sdesc")
    public String getAllBySDesc(Model model, HttpServletRequest request, HttpServletResponse response) {
        try {
            String sdesc = request.getParameter("sdesc");
            
            List<Hotplace> all = hotplaceService.selectAll(sdesc);
            
            model.addAttribute("all", all);
            
            return "content";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
       
    }

}
