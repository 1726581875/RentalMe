package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.support.RemoteInvocationResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mapper.CategoryMapper;
import com.pojo.Category;
import com.service.IcategoryService;
import com.service.IitemService;
import com.util.Result;

@Controller
public class CategoryController {
    
    @Autowired
    private IcategoryService icategoryService;
    @Autowired
    private IitemService iitemService;
//     异步返回所有类别的
    @RequestMapping("getAllCategory")
    @ResponseBody
    public Object getAllCategory() {
        Map<String, List<Category>> resultMap = new HashMap<>();
        resultMap.put("category", icategoryService.listAll());
        return Result.success(resultMap);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
