package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Detail;
import com.pojo.Item;
import com.pojo.Review;
import com.pojo.User;
import com.service.IdetailService;
import com.service.IitemService;
import com.service.IreviewService;
import com.service.IuserService;
import com.util.CommonsState;

@Controller
public class DetailController {
    @Autowired
    private IuserService iuserService;
    @Autowired
    private IdetailService idetailservice;
    @Autowired
    private IreviewService ireviewService;
    @Autowired
    private IitemService iitemService;
//    用户添加实名信息(这里没有简介)
//    如果用户未实名则实名, 不然不执行更新
//    添加完更新session里的user, 更新user的状态, 再返回我的详情页面
    @RequestMapping("addDetail")
    public String addDetail(Detail detail, HttpSession session) {
        if (detail.getRealname() != null && detail.getIdnumber() != null) {
            User user = (User)session.getAttribute("username");
            if (user.getState().equals(CommonsState.USER_STATE_UNCERTIFIED)) {
                int uid = user.getId();
                detail.setUid(uid);
                if(idetailservice.insert(detail) == 1) {
                    user.setState(CommonsState.USER_STATE_NORMAL);
                    iuserService.update(user);
                }
            }
        }
        return "redirect:/myDetailPage";
    }
    
    @RequestMapping("otheruserDetailPage/{id}")
    public String userDetail(@PathVariable int id, Model model){
    	List<Review> targetReviewList = ireviewService.listReviewByUidDESC(id);  	
    	for (Review review : targetReviewList) {
    		ireviewService.fillFromUserById(review);
		}
    	User targetUser = iuserService.getById(id);
    	List<Item> listAllItemByuidDESC = iitemService.listAllItemByuidDESC(id);
    	targetUser.setUserDetail(idetailservice.get(id));
    	model.addAttribute("targetUser", targetUser);
    	model.addAttribute("targetReviewList", targetReviewList);
    	model.addAttribute("item", listAllItemByuidDESC);
    	return "/fore/userDetailPage";
    }
    
}
