package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ForeController {

    @RequestMapping("forehome")
    public String forehome(Model model) {
        return "/fore/forehomePage";
    }
    
    @RequestMapping("loginPage")
    public String loginPage(Model model) {
        return "/fore/loginPage";
    }
    
    @RequestMapping("registerPage")
    public String registerPage(Model model) {
        return "/fore/registerPage";
    }

    @RequestMapping("myDetailPage")
    public String myDetailPage(Model model) {
        return "/fore/myDetailPage";
    }

    @RequestMapping("addItemPage")
    public String addItemPage(Model model) {
        return "/fore/addItemPage";
    }
    
    @RequestMapping("package01")
    @ResponseBody
    public String package01(Model model) {
        String dataString = "{" + 
                "  \"employees\": [" + 
                "    {" + 
                "      \"cid\": \"1\"," + 
                "      \"categoryname\": \"Gates\"" + 
                "    }," + 
                "    {" + 
                "      \"cid\": \"2\"," + 
                "      \"categoryname\": \"Bush\"" + 
                "    }," + 
                "    {" + 
                "      \"cid\": \"3\"," + 
                "      \"categoryname\": \"Carter\"" + 
                "    }" + 
                "  ]" + 
                "}";
        return dataString;
    }
    
}
