package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Detail;
import com.pojo.User;
import com.service.IdetailService;
import com.service.IuserService;
import com.util.CommonsState;

@Controller
public class DetailController {
    @Autowired
    private IuserService iuserService;
    @Autowired
    private IdetailService idetailservice;
    
//    用户添加实名信息(这里没有简介)
//    添加完更新session里的user, 返回我的详情页面
    @RequestMapping("addDetail")
    public String addDetail(Detail detail, HttpSession session) {
        if (detail.getRealname() != null && detail.getIdnumber() != null) {
            User user = (User)session.getAttribute("username");
            int uid = user.getId();
            detail.setUid(uid);
            if(idetailservice.insert(detail) == 1) {
                user.setState(CommonsState.USER_STATE_NORMAL);
                iuserService.update(user);
            }
        }
        return "redirect:/myDetailPage";
    }
    
    
}
