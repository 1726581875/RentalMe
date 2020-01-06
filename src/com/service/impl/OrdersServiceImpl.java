package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.OrdersMapper;
import com.pojo.Orders;
import com.pojo.OrdersExample;
import com.service.IordersService;

@Service
public class OrdersServiceImpl implements IordersService{
	@Autowired
	OrdersMapper ordersMapper;
	
	@Override
	public int insert(Orders orders) {
		return ordersMapper.insertSelective(orders);
	}

	@Override
	public Orders get(int id) {
		return ordersMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Orders> list(Orders id) {
		OrdersExample  example = new OrdersExample();
		if(id.getId() != null)example.createCriteria().andIdEqualTo(id.getId());
		if(id.getOwnid() != null)example.createCriteria().andOwnidEqualTo(id.getId());
		if(id.getUid() != null) example.createCriteria().andUidEqualTo(id.getUid());
		if(id.getId()==null&&id.getOwnid()==null&&id.getUid()==null)
			return null;
		return ordersMapper.selectByExample(example);
	}

	@Override
	public int update(Orders orders) {
		
		return ordersMapper.updateByPrimaryKeySelective(orders);
	}
	
}
