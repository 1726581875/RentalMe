package com.service;

import java.util.List;

import com.pojo.Item;
import com.pojo.Orders;
import com.pojo.User;

public interface IordersService {
	Orders get(int id);
	List<Orders> list(Orders id);	
	int insert(Orders orders);
	int update(Orders orders);
	void txUserPayOrders(User user, Orders orders);
	void txCreateOrder(Orders orders, Item item);
}
