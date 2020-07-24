package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Detail;
import com.pojo.DetailExample;
import com.pojo.User;

public interface IdetailService {
	   Detail get(int uid);
       List<Detail> list();
       int delete(int uid);
       int update(Detail detail);
       int insert(Detail detail);

}
