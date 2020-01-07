package com.service;

import java.util.List;

import com.pojo.Review;

public interface IreviewService {

	List<Review> listReviewByUidDESC(int uid);
	int insert(Review review);
	int delete(int id);
	
	
}
