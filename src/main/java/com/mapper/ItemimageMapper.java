package com.mapper;

import com.pojo.Itemimage;
import com.pojo.ItemimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemimageMapper {
    long countByExample(ItemimageExample example);

    int deleteByExample(ItemimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itemimage record);

    int insertSelective(Itemimage record);

    List<Itemimage> selectByExample(ItemimageExample example);

    Itemimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Itemimage record, @Param("example") ItemimageExample example);

    int updateByExample(@Param("record") Itemimage record, @Param("example") ItemimageExample example);

    int updateByPrimaryKeySelective(Itemimage record);

    int updateByPrimaryKey(Itemimage record);
}