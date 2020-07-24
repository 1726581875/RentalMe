package com.service;

import java.util.List;

import com.pojo.Item;
import com.pojo.User;

public interface IuserService {
	User getById(int id);
	User getByPhoneAndPassword(String phone, String password);
	User getByPhone(String phone);
	User getByUsername(String username);
	List<User> listAll();
	int delete(int id);
	int update(User user);
	int insert(User user);
	
	//2020/1/7下午
	void fillUserDetailByUid(User user);
	
	int userPay(int buyerId,int money);
	int userInMoeny(int sellerId,int money);
	int transfer(int buyerId,int sellerId,int money);
	
}
