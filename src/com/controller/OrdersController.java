package com.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Item;
import com.pojo.Review;
import com.service.IitemService;
import com.service.IordersService;
import com.util.Commons;
import com.util.CommonsState;
import com.util.Result;

@Controller
public class OrdersController {
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
        long preLoan = Long.parseLong(req_map.get("preLoanDate"));
        long preReturn = Long.parseLong(req_map.get("preReturnDate"));
        String countType = item.getCounttype();
        if (countType.equals(CommonsState.ITEM_COUNTTYPE_HOUR)) {
            long diff = preReturn - preLoan;
            int hours = (int)(diff / 1000 / (60 * 60));
            if (hours > item.getMaxtime() || hours < item.getMintime()) {
                return Result.fail(Commons.TIME_ILLEGAL);
            }
            int money = item.getBasepayment() * hours;
            resp_map.put("time", hours);
            resp_map.put("money", money);
            resp_map.put("countType", 0);
            return Result.success(resp_map);
        } else if (countType.equals(CommonsState.ITEM_COUNTTYPE_DAY)) {
            long diff = preReturn - preLoan;
            int days = (int)(diff / 1000 / (60 * 60 * 24));
            if (days > item.getMaxtime() || days < item.getMintime()) {
                return Result.fail(Commons.TIME_ILLEGAL);
            }
            int money = item.getBasepayment() * days;
            resp_map.put("time", days);
            resp_map.put("money", money);
            resp_map.put("countType", 0);
            return Result.success(resp_map);
        } 
        return Result.fail(Commons.NOT_FOUND);
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
