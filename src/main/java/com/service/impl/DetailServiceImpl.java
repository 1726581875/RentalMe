package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.IdetailService;
import com.service.IuserService;
import com.mapper.DetailMapper;
import com.mapper.UserMapper;
import com.pojo.Detail;
import com.pojo.DetailExample;
import com.pojo.User;
import com.pojo.UserExample;
@Service
public class DetailServiceImpl implements IdetailService{

	@Autowired
	private DetailMapper mapperDao;
	public List<Detail> list() {
		DetailExample example = new DetailExample();
		example.createCriteria().andUidEqualTo(1);
		return mapperDao.selectByExample(example);
	}

	public Detail get(int uid) {
		
		return mapperDao.selectByPrimaryKey(uid);
	}

	@Override
	public int delete(int uid) {

		return mapperDao.deleteByPrimaryKey(uid);
	}

	public int update(Detail detail) {
		
		return mapperDao.updateByPrimaryKeySelective(detail);
	}

	@Override
	public int insert(Detail detail) {
	
		return mapperDao.insertSelective(detail);
	}

	

	

}
