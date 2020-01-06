package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ItemMapper;
import com.pojo.Item;
import com.pojo.ItemExample;
import com.pojo.ItemExample.Criteria;
import com.service.IitemService;
@Service
public class ItemServiceImpl implements IitemService{
@Autowired
	ItemMapper itemm;
	public List<Item> selectBytitle(String title) {
		ItemExample example = new ItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andTitleLike("%"+title+"%");
		return itemm.selectByExample(example);
	}
	public Item selectByPrimaryKey(Integer id) {
		return itemm.selectByPrimaryKey(id);
	}
	public int insert(Item record) {
		return itemm.insert(record);
	}
	public int updateByPrimaryKey(Item record) {
		return itemm.updateByPrimaryKey(record);
	}

	public int deleteByPrimaryKey(Integer id) {
		return itemm.deleteByPrimaryKey(id);
	}
	public int deleteByExample(Item record){
		ItemExample example = new ItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(record.getId());
		criteria.andUidEqualTo(record.getUid());
		return itemm.deleteByExample(example);
	}
}
