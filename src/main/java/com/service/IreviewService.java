package com.service;

import java.util.List;

import com.pojo.Item;
import com.pojo.Orders;
import com.pojo.Review;
import com.pojo.User;

public interface IreviewService {

	List<Review> listReviewByUidDESC(int uid);
	int insert(Review review);
	int delete(int id);
	
	 void fillUserByUid(Review review);
	 void fillFromUserById(Review review);
	void txAddreviewAndChangeOrder(Review review, Orders orders, int witchReview);
}
