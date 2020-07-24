package com.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.User;
import com.service.IuserService;
import com.util.Commons;
import com.util.CommonsState;
import com.util.MyTools;
import com.util.Result;

@Controller
public class UserController {
    @Autowired
    private IuserService iuserService;

//    用户登录
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

//    退出
    @RequestMapping(value = "forelogout", method = RequestMethod.GET)
    public String forelogout(HttpSession session) {
        session.invalidate();
        return "redirect:/forehome";
    }

//      注册一个用户, 注册成功跳到登录页
    @RequestMapping("insertUser")
    public String register(User user, Model m) {
        System.out.println("注册用户名: " );
        System.out.println(user);
        user.setMoney(0);
        user.setRole(0);
        user.setState(CommonsState.USER_STATE_UNCERTIFIED);
        if (iuserService.insert(user) != 1) {
            m.addAttribute("msg", Commons.REGISTER_FAIL);
            return "redirect:/registerPage";
        }
        m.addAttribute("msg", Commons.REGISTER_SUCCESS);
        return "redirect:/loginPage";
    }

//    异步判断用户名是否存在
    @RequestMapping(value = "UserNameAjax")
    @ResponseBody
    public Object testregisterCheckUserName(@RequestBody Map<String, String> req_map) {
        String username = req_map.get("username");
        Map<String, Integer> respMap = new HashMap<>();
        if (iuserService.getByUsername(username) == null) {
            respMap.put("flag", 1);
        } else {
            respMap.put("flag", 0);
        }
        return respMap;
    }

//    异步判断电话是否存在
    @RequestMapping(value = "UserPhoneAjax")
    @ResponseBody
    public Object testregisterCheckPhone(@RequestBody Map<String, String> req_map) {
        String phone = req_map.get("phone");
        Map<String, Integer> respMap = new HashMap<>();
        if (iuserService.getByPhone(phone) == null) {
            respMap.put("flag", 1);
        } else {
            respMap.put("flag", 0);
        }
        return respMap;
    }
    
// 
    @RequestMapping("toRecharge")
    public String toRecharge(){
    	
    	return "/fore/myRechargePage";
    }
    
    @RequestMapping("recharge")
    public String userRecharge(int money,Model m,HttpSession session){
    	
    	User user = (User)session.getAttribute("user");
   	    System.out.println("money");
   	    System.out.println("UserID:"+user.getId());
   	  
    	int flag = iuserService.userInMoeny(user.getId(),money);
    	if(flag==0) {
    		m.addAttribute("msg", Commons.REGISTER_FAIL);
            return "redirect:/registerPage";
    	}
    	User user2 = iuserService.getById(user.getId());
    	session.setAttribute("user",user2);
    	
    	return "redirect:/myDetailPage";
    }
    
    

}
