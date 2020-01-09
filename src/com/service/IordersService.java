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
	List<Orders> listMyOrders(User user);
	List<Orders> listMyRental(User user);
	void fillItemByIid(Orders orders);
	void fillOwnUserByOwnId(Orders orders);
	void fillBuyUserByUid(Orders orders);
	void txBuyerCancelOrder(Orders orders, Item item);
	void txSellerCancelOrder(Orders orders, Item item);
	void txBuyerPayBalance(User user, Orders orders);
    void txSellerConfirm(User ownuser, User user, Orders orders);
}
