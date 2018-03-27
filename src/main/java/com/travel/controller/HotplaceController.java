package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.basic.entity.Hotplace;
import com.travel.basic.service.HotplaceService;
import com.travel.common.util.DateUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author suhu
 */
@Controller
// @RequestMapping("/travel")
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
     * 查询全部数据返回至前端 排序查询使用
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
    
    
    
    /**
     * 跳转到条形图页面
     * 
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/tochart")
    public String toChart(Model model, HttpServletRequest request, HttpServletResponse response) {
        try {
            return "chart";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    /**
     * 根据月份查询 
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/chart")
    @ResponseBody
    public JSONObject chart(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            List<Hotplace> hList = hotplaceService.selectByMonth();
            
            JSONObject resultObj = new JSONObject();
            
            if (hList == null) return resultObj;
            

            JSONArray source = new JSONArray();
            
            JSONArray product = new JSONArray();
            product.add("product");
            // 只展示当前月份和上一月份数据
            product.add(DateUtils.getMonth() -1 +"月");
            product.add(DateUtils.getMonth() +"月");
            source.add(product);
            
            for (int i = 0; i < hList.size(); i++) {
                // 数据内容，名称 + 人气值
                JSONArray arrcont = new JSONArray();
                arrcont.add(hList.get(i).getsName());
                arrcont.add(hList.get(i).getSoldnum1());
                arrcont.add(hList.get(i).getSoldnum2());
                source.add(arrcont);
            }
            resultObj.put("source", source);
            return resultObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
    
    /**
     * 根据价格展示
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/chartprice")
    @ResponseBody
    public JSONObject chartprice(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            List<Hotplace> hList = hotplaceService.selectByPrice();
            
            JSONObject resultObj = new JSONObject();
            
            if (hList == null) return resultObj;
            

            JSONArray source = new JSONArray();
            
            JSONArray product = new JSONArray();
            product.add("product");
            // 只展示当前月份和上一月份数据
            product.add(DateUtils.getMonth() -1 +"月");
            product.add(DateUtils.getMonth() +"月");
            source.add(product);
            
            for (int i = 0; i < hList.size(); i++) {
                // 数据内容，名称 + 人气值
                JSONArray arrcont = new JSONArray();
                arrcont.add(hList.get(i).getsName());
                arrcont.add(hList.get(i).getPrice1());
                arrcont.add(hList.get(i).getPrice2());
                source.add(arrcont);
            }
            resultObj.put("source", source);
            return resultObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
