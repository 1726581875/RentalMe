package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.Item;
import com.pojo.User;
import com.service.IitemService;
import com.util.Commons;

@Controller
public class ItemController {

    @Autowired
    private IitemService iitemService;
    
    @RequestMapping(value = "addItem", method = RequestMethod.POST)
    public String addItem(Item item, Model model, HttpSession session) {
        User user = (User) session.getAttribute("user"); 
        if (user == null) {
            model.addAttribute("msg", Commons.UN_LOGIN);
            return "/fore/loginPage";
        }
        Item newItem = new Item();
        newItem.setTitle(item.getTitle());
        newItem.setCid(item.getCid());
        newItem.setContact(item.getContact());
        newItem.setBasepayment(item.getBasepayment());
        newItem.setCounttype(item.getCounttype());
        newItem.setMintime(item.getMintime());
        newItem.setMaxtime(item.getMaxtime());
        newItem.setOvertimemoney(item.getOvertimemoney());
        newItem.setDeposit(item.getDeposit());
        newItem.setRenewable(item.getRenewable());
        iitemService.insert(newItem);
        model.addAttribute("item", item);
        return "redirect:/itemDetailPage";
    }
    
    
    
}
