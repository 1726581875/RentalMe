package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Category;
import com.pojo.Item;
import com.pojo.Orders;
import com.pojo.User;
import com.service.IcategoryService;
import com.service.IdetailService;
import com.service.IitemImageService;
import com.service.IitemService;
import com.service.IordersService;
import com.service.IuserService;
import com.util.Commons;
import com.util.CommonsState;

@Controller
public class ForeController {

	@Autowired
	private IitemImageService iitemImageService;
    @Autowired
    private IuserService iuserService;
    @Autowired
    private IcategoryService icategoryService;
    @Autowired
    private IitemService iitemService;
    @Autowired
    private IdetailService idetailService;
    @Autowired
    private IordersService iordersService;
    
    @RequestMapping("error")
    public String error(String msg, Model model) {
        model.addAttribute("msg", msg);
        return "/error";
    }
    
//    首页, 首先添加所有分类, 还有所有商品
    @RequestMapping("forehome")
    public String forehome(Model model) {
        model.addAttribute("categoryList", icategoryService.listAll());
        List<Item> itemList = iitemService.listAllItemByStateDESC(CommonsState.ITEM_STATE_ENABLE);
        for (Item item2 : itemList) {
            iitemService.fillFirstImageById(item2);
            iitemService.fillOwnUserByUid(item2);
        }
        model.addAttribute("itemList", itemList);
        return "/fore/forehomePage";
    }
//    首页, 根据分类列出所有商品返回首页, 还要列出所有分类
//  根据类别返回所有商品list, 包含首张图片, 卖家信息
  @RequestMapping("listByCategory/{cid}")
  public String listByCategory(@PathVariable int cid, Model model) {
      List<Item> list = null;
      System.out.println("cid:" + cid);
      if (cid != -1) {
          Category category = icategoryService.get(cid);
          if (category != null) {
              list = iitemService.listAllItemByStateAndCid(CommonsState.ITEM_STATE_ENABLE, category.getId());
              } else {
                  list = iitemService.listAllItemByStateDESC(CommonsState.ITEM_STATE_ENABLE);
            }
          } else {
              list = iitemService.listAllItemByStateDESC(CommonsState.ITEM_STATE_ENABLE);
          }
      if (!list.isEmpty()) {
          for (Item item2 : list) {
              iitemService.fillFirstImageById(item2);
              iitemService.fillOwnUserByUid(item2);
          }
	}
      model.addAttribute("categoryList", icategoryService.listAll());
      model.addAttribute("itemList", list);
      System.out.println(list);
      return "/fore/forehomePage";
  }
    
    
    @RequestMapping("loginPage")
    public String loginPage(Model model) {
        return "/fore/loginPage";
    }
    
    @RequestMapping("registerPage")
    public String registerPage(Model model) {
        return "/fore/registerPage";
    }
//    我的详情页面, 根据session里的user来获取用户详情, 返回一个填充了userDetail的user. 
//    如果未登录返回登录页
    @RequestMapping("myDetailPage")
    public String myDetailPage(Model model, HttpSession session) {
        User user = (User)session.getAttribute("user");
        if (user == null) {
            model.addAttribute("msg", Commons.UN_LOGIN);
            return "redirect:/loginPage";
        } else {
            iuserService.fillUserDetailByUid(user);
            model.addAttribute("user", user);
            return "/fore/myDetailPage";
        }
    }

    @RequestMapping("addItemPage")
    public String addItemPage(Model model) {
        model.addAttribute("categoryList", icategoryService.listAll());
        return "/fore/addItemPage";
    }
    
//    通过iid来返回物品详情和相关的图片内容
//    填充的可选字段: 首张图片, 详情图片, 卖家信息
    @RequestMapping("itemDetailPage/{iid}")
    public String itemDetailPage(@PathVariable int iid, Model model) {
        Item item = iitemService.selectByPrimaryKey(iid);
        if (item == null) {
            model.addAttribute("msg", Commons.ITEM_NOT_EXIT);
            return "/error";
        }
        iitemService.fillFirstImageById(item);
        iitemService.fillItemimagesById(item);
        iitemService.fillOwnUserByUid(item);
        model.addAttribute("item", item);
        return "/fore/itemDetailPage";
    }
//    下单链接, 返回item到前端, 跳转到订单计算页
    @RequestMapping("orderItem/{iid}")
    public String orderConfirm(@PathVariable int iid, Model model, HttpSession session) {
        Item item = iitemService.selectByPrimaryKey(iid);
        iitemService.fillFirstImageById(item);
        iitemService.fillOwnUserByUid(item);
        User user = (User)session.getAttribute("user");
        if (item.getUid() == user.getId()) {
            model.addAttribute("msg", Commons.ORDER_ERROR);
            return "/error";
        }
        model.addAttribute("item", item);
        return "/fore/orderItemPage";
    }
    
    
//    用户查看自己买到的订单
//    如果为空返回空, 不为空返回填充了item和user的orders, item填充了首张图片(未测试)
    @RequestMapping("myOrdersPage")
    public String orderConfirm(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Orders> myOrdersList = iordersService.listMyOrders(user);
        if (!myOrdersList.isEmpty()) {
            for (Orders orders : myOrdersList) {
                iordersService.fillItemByIid(orders);
                iordersService.fillOwnUserByOwnId(orders);
                iitemService.fillFirstImageById(orders.getItem());
            }
        }
        model.addAttribute("myOrdersList", myOrdersList);
        return "/fore/myOrdersPage";
    }
//    卖家查看哪些人想借我的东西
//    返回myRentalList, 填充了Item和首张图片, BuyUser
    @RequestMapping("myRentalPage")
    public String myRentalPage(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Orders> myRentalList = iordersService.listMyRental(user);
        if (!myRentalList.isEmpty()) {
            for (Orders orders : myRentalList) {
            	System.out.println(orders);
                iordersService.fillItemByIid(orders);
                iordersService.fillBuyUserByUid(orders);
                iitemService.fillFirstImageById(orders.getItem());
            }
        }
        model.addAttribute("myRentalList", myRentalList);
        return "/fore/myRentalPage";
    }
    
    
    
    
    
    
    
    
    
}
