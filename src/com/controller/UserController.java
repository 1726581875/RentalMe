package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.User;
import com.service.IuserService;
import com.util.Commons;
import com.util.MyTools;
import com.util.Result;

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
    
    
    /* 2020/1/6 新增注册功能  */
    @RequestMapping("insertUser")	
	public String register(User user,Model m){
		user.setMoney(0);
		user.setRole(0);
		user.setState("正常");
		if(iuserService.insert(user)!=1){
			m.addAttribute("msg",Commons.REGISTER_FAIL);
			return "redirect:/registerPage";
			}
		m.addAttribute("msg", Commons.REGISTER_SUCCESS);
		return "redirect:/loginPage";
	}
	

@RequestMapping(value="UserNameAjax")
public  void testregisterCheckUserName(@RequestBody  String username,PrintWriter out){
	//System.out.println("testJson.......");
	String namestr = username.substring(username.lastIndexOf("=")+1,username.length());
	//System.out.println(namestr);
	
	if(iuserService.getByUsername(namestr)==null)
	{String result="{\"flag\":\"1\"}";out.print(result);
	}
	else{
   String result="{\"flag\":\"0\"}";out.print(result);
	}

	
}


@RequestMapping(value="UserPhoneAjax")
public  void testregisterCheckPhone(@RequestBody  String phone,PrintWriter out){
	System.out.println("testJson.......");
	//System.out.println(username.lastIndexOf("="));
	String phoneStr = phone.substring(phone.lastIndexOf("=")+1,phone.length());
	System.out.println(phoneStr);
	
	if(iuserService.getByPhone(phoneStr)==null)
	{String result="{\"flag\":\"1\"}";out.print(result);
	}
	else{
   String result="{\"flag\":\"0\"}";
   out.print(result);
 
	}

	
}

    
    
}
