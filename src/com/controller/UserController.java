package com.controller;

import java.io.PrintWriter;
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

    /* 2020/1/6 新增注册功能 */
    @RequestMapping("insertUser")
    public String register(User user, Model m) {

        user.setMoney(0);
        user.setRole(0);
        user.setState("正常");
        if (iuserService.insert(user) != 1) {
            m.addAttribute("msg", Commons.REGISTER_FAIL);
            return "redirect:/registerPage";
        }
        m.addAttribute("msg", Commons.REGISTER_SUCCESS);
        return "redirect:/loginPage";
    }

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

}
