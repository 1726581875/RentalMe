package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.Detail;
import com.pojo.User;
import com.pojo.UserExample;
import com.pojo.UserExample.Criteria;
import com.service.IdetailService;
import com.service.IuserService;

@Service
public class UserServiceImpl implements IuserService {
	@Autowired
	private UserMapper usermapper;
	
	@Autowired
	private IdetailService detailService;
	
	// UserExample userExample = new UserExample();
	
	@Override
	public User getById(int id) {
		return usermapper.selectByPrimaryKey(id);
	}
	@Override
	public User getByPhoneAndPassword(String phone, String password) {
		
	   UserExample userExample = new UserExample();
	   userExample.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
	   System.out.println("1get" + userExample);
		List<User> result = (List<User>) usermapper.selectByExample(userExample);
		if (result.isEmpty())
			return null;
		return result.get(0);
	}
	
	@Override
	public User getByPhone(String phone) {
		 UserExample userExample = new UserExample();
		   userExample.createCriteria().andPhoneEqualTo(phone);
		   System.out.println("2get" + userExample);
			List<User> result = (List<User>) usermapper.selectByExample(userExample);
			for (User user2 : result) {
				System.out.println(user2);
			}
			if (result.isEmpty())
				return null;
			return result.get(0);
	}
	
	
	@Override
	public List<User> listAll() {
		
		 UserExample userExample = new UserExample();
			
		return usermapper.selectByExample(userExample);
	}
	
	@Override
	public int delete(int id) {
		
		return usermapper.deleteByPrimaryKey(id);
	}
	@Override
	public int update(User user) {
		
		return usermapper.updateByPrimaryKeySelective(user);
	}
	@Override
	public int insert(User user) {
		
		return usermapper.insertSelective(user);
	}
	@Override
	public User getByUsername(String username) {
		 UserExample userExample = new UserExample();
		 userExample.createCriteria().andUsernameEqualTo(username);
		 if(usermapper.selectByExample(userExample).isEmpty()) return null;
		 
		return usermapper.selectByExample(userExample).get(0);
	}
	
	
	//2020/01/7下午
	@Override
	public void fillUserDetailByUid(User user) {
		
		Detail detail = detailService.get(user.getId());		
		user.setUserDetail(detail);
	}
	
}
