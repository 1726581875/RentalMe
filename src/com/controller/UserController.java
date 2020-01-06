package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.User;
import com.service.IuserService;
import com.util.Commons;
import com.util.MyTools;

@Controller
public class UserController {
    @Autowired
    private IuserService iuserService;
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {
        System.out.println("user:" + user.getPhone() + "password:" + user.getPassword());
        try {
            if (MyTools.isStringEmpty(user.getPhone(), user.getPassword())) {
                model.addAttribute("msg", Commons.PARAMETER_IS_EMPTY);
                return "/fore/loginPage";
            }
            User user2 = iuserService.getByPhoneAndPassword(user.getPhone(), user.getPassword());
            if (user2 == null) {
                model.addAttribute("msg", Commons.LOGIN_FAIL);
                return "/fore/loginPage";
            }
            System.out.println(user2.getUsername());
            session.setAttribute("user", user2);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/forehome";
    }

    @RequestMapping(value = "forelogout", method = RequestMethod.GET)
    public String forelogout(HttpSession session) {
        session.invalidate();
        return "redirect:/forehome";
    }
    
}
