package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ItemMapper;
import com.mapper.OrdersMapper;
import com.mapper.UserMapper;
import com.pojo.Item;
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
	@Autowired
	ItemMapper itemMapper;
	
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

    @Override
    public void txCreateOrder(Orders orders, Item item) {
        // TODO Auto-generated method stub
        insert(orders);
        item.setRentalstate(CommonsState.ITEM_STATE_DISABLE);
        itemMapper.updateByPrimaryKey(item);
    }

    @Override
    public List<Orders> listMyOrders(User user) {
        // TODO Auto-generated method stub
        OrdersExample example = new OrdersExample();
        example.setOrderByClause("id DESC");
        if (user.getId() != null) example.createCriteria().andUidEqualTo(user.getId());
        else return null;
        return ordersMapper.selectByExample(example);
    }

    @Override
    public List<Orders> listMyRental(User user) {
        // TODO Auto-generated method stub
        OrdersExample example = new OrdersExample();
        example.setOrderByClause("id DESC");
        if (user.getId() != null) example.createCriteria().andOwnidEqualTo(user.getId());
        else return null;
        return ordersMapper.selectByExample(example);
    }

    @Override
    public void fillItemByIid(Orders orders) {
        // TODO Auto-generated method stub
        orders.setItem(itemMapper.selectByPrimaryKey(orders.getIid()));
    }

    @Override
    public void fillOwnUserByOwnId(Orders orders) {
        // TODO Auto-generated method stub
        orders.setOwnUser(userMapper.selectByPrimaryKey(orders.getOwnid()));
    }
    
    @Override
    public void fillBuyUserByUid(Orders orders) {
        // TODO Auto-generated method stub
        orders.setBuyUser(userMapper.selectByPrimaryKey(orders.getUid()));
    }

    @Override
    public void txBuyerCancelOrder(Orders orders, Item item) {
        // TODO Auto-generated method stub
        orders.setStatus(CommonsState.BUYER_CANCELLED);
        ordersMapper.updateByPrimaryKeySelective(orders);
        item.setRentalstate(CommonsState.ITEM_STATE_ENABLE);
        itemMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public void txSellerCancelOrder(Orders orders, Item item) {
        // TODO Auto-generated method stub
        orders.setStatus(CommonsState.SALLER_CANCELLED);
        ordersMapper.updateByPrimaryKeySelective(orders);
        item.setRentalstate(CommonsState.ITEM_STATE_ENABLE);
        itemMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public void txBuyerPayBalance(User user, Orders orders) {
        // TODO Auto-generated method stub
        user.setMoney(user.getMoney() - orders.getAdjustment());
        userMapper.updateByPrimaryKeySelective(user);
        orders.setStatus(CommonsState.UNREVIEW);
        ordersMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public void txSellerConfirm(User ownuser, User user, Orders orders) {
        // TODO Auto-generated method stub
        ownuser.setMoney(ownuser.getMoney() + orders.getRealpaymoney());
        userMapper.updateByPrimaryKeySelective(ownuser);
        user.setMoney(user.getMoney() - orders.getRealpaymoney() +
                orders.getPrepaymoney());
        userMapper.updateByPrimaryKeySelective(user);
        orders.setStatus(CommonsState.UNREVIEW);
        ordersMapper.updateByPrimaryKeySelective(orders);
    }
	
    
    
}
