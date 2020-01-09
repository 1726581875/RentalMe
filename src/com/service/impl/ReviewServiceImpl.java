package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ReviewMapper;
import com.pojo.Review;
import com.pojo.ReviewExample;
import com.service.IreviewService;
@Service
public class ReviewServiceImpl implements IreviewService{

	@Autowired
	private ReviewMapper reviewMapper;
	
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

}
