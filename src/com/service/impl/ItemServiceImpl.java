package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ItemMapper;
import com.pojo.Item;
import com.pojo.ItemExample;
import com.pojo.ItemExample.Criteria;
import com.pojo.Itemimage;
import com.pojo.User;
import com.service.IitemImageService;
import com.service.IitemService;
import com.service.IuserService;
@Service
public class ItemServiceImpl implements IitemService{
@Autowired
	ItemMapper itemm;
@Autowired   
    IuserService userService;
@Autowired
    IitemImageService  itemImageService ;

    

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
		return itemm.insertSelective(record);
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
	
//新增2020/1/7	
	@Override
	public void fillOwnUserByUid(Item item) {
		User user = userService.getById(item.getUid());		
		item.setOwnUser(user);
		
	}
	@Override
	public void fillFirstImageById(Item item) {
	List<Itemimage> listAllItemImg = itemImageService.listAllItemImg(item.getId());
	if(!listAllItemImg.isEmpty())
	item.setFirstImage(listAllItemImg.get(0));	
	}
	@Override
	public void fillItemimagesById(Item item) {
		List<Itemimage> listImg = itemImageService.listAllItemImg(item.getId());
		if(!listImg.isEmpty())
		item.setItemimages(listImg);	
	}
	
	
	@Override
	public List<Item> listAllItemDESC() {
		ItemExample example = new ItemExample();
		example.setOrderByClause("id DESC");
		return itemm.selectByExample(example);
	}
	
	@Override
	public List<Item> listAllItemByStateDESC(int stae) {
		ItemExample example = new ItemExample();
		example.setOrderByClause("id DESC");
		example.createCriteria().andRentalstateEqualTo(stae);
		return itemm.selectByExample(example);
	}
	@Override
	public List<Item> listAllItemByStateAndCid(int state,int cid) {
		ItemExample example = new ItemExample();
		example.setOrderByClause("id DESC");
		example.createCriteria().andCidEqualTo(cid).andRentalstateEqualTo(state);;
		return itemm.selectByExample(example);
	}
}
