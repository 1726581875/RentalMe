package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.OrdersMapper;
import com.mapper.ReviewMapper;
import com.mapper.UserMapper;
import com.pojo.Orders;
import com.pojo.Review;
import com.pojo.ReviewExample;
import com.pojo.User;
import com.service.IordersService;
import com.service.IreviewService;
import com.service.IuserService;
import com.util.CommonsState;
@Service
public class ReviewServiceImpl implements IreviewService{

	@Autowired
	private ReviewMapper reviewMapper;
	
	@Autowired
	private IuserService userService;
	@Autowired
	private OrdersMapper ordersMapper;
	@Override
	public List<Review> listReviewByUidDESC(int uid) {
		ReviewExample example = new ReviewExample();
		example.setOrderByClause("id DESC");
		example.createCriteria().andUidEqualTo(uid);
		return reviewMapper.selectByExample(example);
	}

	@Override
	public int insert(Review review) {
		
		
		return reviewMapper.insertSelective(review);
	}

	@Override
	public int delete(int id) {
		
		return reviewMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void fillUserByUid(Review review) {
		
		User user = userService.getById(review.getUid());
		review.setUser(user);
	}

	@Override
	public void fillFromUserById(Review review) {
		User user = userService.getById(review.getFromuid());
		review.setFromUser(user);
		
	}

    @Override
    public void txAddreviewAndChangeOrder(Review review, Orders orders, int witchReview) {
        // TODO Auto-generated method stub
        reviewMapper.insert(review);
        if (witchReview == 0) {
            orders.setStatus(CommonsState.BUYER_REVIEW);
        } else {
            orders.setStatus(CommonsState.SALLER_REVIEW);
        }
        ordersMapper.updateByPrimaryKeySelective(orders);
    }



}
