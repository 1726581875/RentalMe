package com.service;

import java.util.List;

import com.pojo.Orders;

public interface IordersService {
	Orders get(int id);
	List<Orders> list(Orders id);	
	int insert(Orders orders);
	int update(Orders orders);
}
