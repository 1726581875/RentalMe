package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Category;
import com.pojo.Item;
import com.service.IcategoryService;
import com.service.IitemService;
import com.util.Commons;

@Controller
public class ForeController {

    @Autowired
    private IcategoryService icategoryService;
    @Autowired
    private IitemService iitemService;

    @RequestMapping("error")
    public String error(String msg, Model model) {
        model.addAttribute("msg", msg);
        return "/error";
    }
    
//    首页, 首先添加所有分类
    @RequestMapping("forehome")
    public String forehome(Model model) {
        model.addAttribute("categoryList", icategoryService.listAll());
        return "/fore/forehomePage";
    }
//    首页, 根据分类列出所有商品返回首页
//  根据类别返回所有商品list, 包含首长图片, 卖家信息(未完成)
  @RequestMapping("listByCategory/{cid}")
  public String listByCategory(int cid, Model model) {
      if (cid == -1) {
        iitemService.
    }
      return "redirect:/forehome";
  }
    
    
    @RequestMapping("loginPage")
    public String loginPage(Model model) {
        return "/fore/loginPage";
    }
    
    @RequestMapping("registerPage")
    public String registerPage(Model model) {
        return "/fore/registerPage";
    }

    @RequestMapping("myDetailPage")
    public String myDetailPage(Model model) {
        return "/fore/myDetailPage";
    }

    @RequestMapping("addItemPage")
    public String addItemPage(Model model) {
        return "/fore/addItemPage";
    }
    
//    通过iid来返回物品详情和相关的图片内容
    @RequestMapping("itemDetailPage/{iid}")
    public String itemDetailPage(int iid, Model model) {
        Item item = iitemService.selectByPrimaryKey(iid);
        if (item == null) {
            return "redirect:/error?msg=" + Commons.ITEM_NOT_EXIT;
        }
        iitemService.fillFirstImageById(item);
        iitemService.fillItemimagesById(item);
        iitemService.fillOwnUserByUid(item);
        model.addAttribute("item", item);
        return "/fore/itemDetailPage";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
