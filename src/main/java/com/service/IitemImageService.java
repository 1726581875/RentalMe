package com.service;

import java.util.List;

import com.pojo.Itemimage;

public interface IitemImageService {
	
	List<Itemimage> listAllItemImg(int iid);
	Itemimage get(int id);
	int insert(Itemimage img);
	int update(Itemimage img);
	
	
}
