package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.IuserService;

@Controller
public class ReviewController {

    @Autowired
    private IuserService iuserService;
    
}
