package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.OrdersMapper;
import com.mapper.UserMapper;
import com.pojo.Orders;
import com.pojo.OrdersExample;
import com.pojo.User;
import com.service.IordersService;
import com.util.Commons;
import com.util.CommonsState;

@Service
public class OrdersServiceImpl implements IordersService{
	@Autowired
	OrdersMapper ordersMapper;
	@Autowired
	UserMapper userMapper;
	
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

    @Override
    public void txUserPayOrders(User user, Orders orders) {
        // TODO Auto-generated method stub
        user.setMoney(orders.getPrepaymoney());
        userMapper.reduceMoney(user);
//        测试事务/金钱减少+订单变化
//        int i = 1/0;
        orders.setStatus(CommonsState.SALLER_UNLOAN);
        orders.setPrepaydate(new Date());
        ordersMapper.updateByPrimaryKeySelective(orders);
    }
	
}
