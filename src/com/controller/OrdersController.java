package com.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.weaver.reflect.IReflectionWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Item;
import com.pojo.Orders;
import com.pojo.Review;
import com.pojo.User;
import com.service.IdetailService;
import com.service.IitemService;
import com.service.IordersService;
import com.service.IuserService;
import com.util.Commons;
import com.util.CommonsState;
import com.util.MyTools;
import com.util.Result;

@Controller
public class OrdersController {
    @Autowired
    private IuserService iuserService;
    @Autowired
    private IordersService iordersService;
    @Autowired
    private IitemService iitemService;
    
    
//    异步计算金额
//    前端传物品id和时间过来, 这里做一个异步计算金额
//    返回值:time是时长(天/小时), money是钱(单位分), countType是时间类型(0是小时,1是天)
    @RequestMapping("orderMoneyAjax")
    @ResponseBody
    public Object orderMoneyAjax(@RequestBody Map<String, String> req_map) {
        Map<String, Integer> resp_map = new HashMap<String, Integer>();
        int iid = Integer.parseInt(req_map.get("iid"));
        Item item = iitemService.selectByPrimaryKey(iid);
        if (item == null) {
            return Result.fail(Commons.NOT_FOUND);
        }
        long preLoan = Long.parseLong(req_map.get("preLoanDate"));
        long preReturn = Long.parseLong(req_map.get("preReturnDate"));
        String countType = item.getCounttype();
        int time = MyTools.countCheckoutTime(item, preReturn - preLoan);
        if (time == -1) {
            return Result.fail(Commons.TIME_ILLEGAL);
        }
        int money = item.getBasepayment() * time;
        resp_map.put("time", time);
        resp_map.put("money", money);
        resp_map.put("countType", Integer.parseInt(countType));
        return Result.success(resp_map);
    }
    
//    创建订单, 并返回订单付款页(orderConfirmPage.jsp), 返回order信息
//    item里填充了首张图片, order里填充了ownUser卖家信息
    @RequestMapping("createOrder/{iid}")
    public String createOrder(@PathVariable("iid") int iid,String preLoanTime,String preReturnTime,Model model, HttpSession session) {
        Item item = iitemService.selectByPrimaryKey(iid);
        if (item == null) {
            model.addAttribute("msg", Commons.ITEM_NOT_EXIT);
            return "/error";
        }
        long preLoan = Long.parseLong(preLoanTime);
        long preReturn = Long.parseLong(preReturnTime);
        
        int prepaymoney = MyTools.countCheckoutTime(item, preReturn-preLoan);
        if (prepaymoney == -1) {
            model.addAttribute("msg", Commons.CREATE_ORDER_FAIL);
            return "/error";
        }
        User ownUser = iuserService.getById(item.getUid());
        User user = (User)session.getAttribute("user");
        Orders orders = new Orders();
        orders.setOwnid(ownUser.getId());
        orders.setUid(user.getId());
        orders.setIid(item.getId());
        orders.setOrdercode(System.currentTimeMillis()+MyTools.getFourRandom());
        orders.setCreatedate(new Date());
        orders.setPreloandate(new Date(preLoan));
        orders.setPrereturndate(new Date(preReturn));
        orders.setPrepaymoney(prepaymoney);
        orders.setStatus(CommonsState.BUYER_UNPAYMENT);
        
        model.addAttribute("item", item);
        iordersService.insert(orders);
        
        return "/fore/orderConfirmPage";
    }
   
    
//    确认付款fdsasagdgfds  事务
    @RequestMapping("buyerPayOrder/{oid}")
 public String buyerPayOrder(@PathVariable int oid,Model model,HttpSession session){
    	
    	   User user = (User) session.getAttribute("user");
    	   Orders orders = iordersService.get(oid);
    	   if (orders == null) {
            model.addAttribute("msg", Commons.NOT_FOUND);
            return "/error";
    	   }
    	   if(orders.getPrepaymoney() < user.getMoney()){
    		   //可支付
    		   iordersService.txUserPayOrders(user, orders);
    		   return "/fore/paymentSuccess";
    	   }
    	   else{//支付失败
    		   model.addAttribute("msg", Commons.INSUFFICIENT_BALANCE);
    		   return "redirect:/toRecharge";
    	   }
    }
    
    @RequestMapping("buyerCancelOrder/{oid}")
   public String buyerCancelOrder(@PathVariable int oid,Model model){
	   
    	
	   return " ";
   }
    
    
    
    
//    添加一个订单评价
//    判断订单的uid是否为当前用户
    /*
     * @RequestMapping(value = "addOrderReview/{oid}", method = RequestMethod.POST)
     * public String addOrderReview(int oid, String content, int review, Model
     * model, HttpSession session) {
     * 
     * Review new_review = new Review(); new_review.setContent(content);
     * new_review.setReview(review);
     * 
     * }
     */
        
        
        
        
        
        
        
        
        
        
        
}
