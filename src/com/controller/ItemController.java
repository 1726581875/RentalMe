package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {

    @RequestMapping(value = "addItem", method = RequestMethod.POST)
    public String addItem(HttpSession session) {
        
        return "redirect:/forehome";
    }
    
    
    
}
