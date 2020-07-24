package com.service;

import java.util.List;

import com.pojo.Category;

public interface IcategoryService {
    List<Category> listAll();
    Category get(int cid);
    int insert(Category category);
    int delete(int cid);
}
