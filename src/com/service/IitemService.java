package com.service;

import java.util.List;

import com.pojo.Item;
import com.pojo.ItemExample;

public interface IitemService {
	List<Item> selectBytitle(String title);
	 Item selectByPrimaryKey(Integer id);
	 int insert(Item record);
	 int updateByPrimaryKey(Item record);
	 int deleteByPrimaryKey(Integer id);
	 int deleteByExample(Item record);
}
