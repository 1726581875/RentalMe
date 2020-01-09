package com.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Orders;
import com.pojo.Review;
import com.pojo.User;
import com.service.IordersService;
import com.service.IreviewService;
import com.service.IuserService;

@Controller
public class ReviewController {
    @Autowired
	IordersService iordersService;
	
    @Autowired
    IreviewService ireviewService;
    
    @Autowired
    private IuserService iuserService;
    
    
    @RequestMapping("addOrderReviewPage/{oid}")
   public String toReview(@PathVariable int oid,Model m){
	   
    	m.addAttribute("oid", oid);
	  return  "fore/addOrderReview";
   }
    
    @RequestMapping("addOrderReview")
    public String addOrderReview(Review review,int oid,HttpSession session)
     {
    	User user = (User) session.getAttribute("user");

        int witchReview = 0;
    	Orders orders = iordersService.get(oid);
    	
    	Review review2 = new Review(); 
    	if(user.getId()==orders.getUid()){	
    		review2.setUid(orders.getOwnid());
    	}
    	else if(user.getId() == orders.getOwnid())
    	{
    		review2.setUid(orders.getUid());
    		witchReview = 1;
    	}
    	
    	review2.setFromuid(user.getId());
    	review2.setSubmitdate(new Date());
    	review2.setContent(review.getContent());
    	review2.setReview(review.getReview());
    	ireviewService.txAddreviewAndChangeOrder(review2, orders, witchReview);
    	
    	return "redirect:/myOrdersPage";
    }
    
}
