package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ItemimageMapper;
import com.pojo.Itemimage;
import com.pojo.ItemimageExample;
import com.service.IitemImageService;


@Service
public class ItemImageServiceImpl implements IitemImageService{
	
	@Autowired
    private ItemimageMapper itemimageMapper;
  
	@Override
	public int insert(Itemimage img) {
		
		return itemimageMapper.insertSelective(img);
	}

	
	@Override
	public int update(Itemimage img) {
		
		return itemimageMapper.updateByPrimaryKeySelective(img);
	}



	@Override
	public List<Itemimage> listAllItemImg(int iid) {
		ItemimageExample example = new ItemimageExample();
		example.createCriteria().andIidEqualTo(iid);
		return itemimageMapper.selectByExample(example);
	}


	@Override
	public Itemimage get(int id) {
		
		return itemimageMapper.selectByPrimaryKey(id);
	}

}
