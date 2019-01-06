package com.hussir.micromall.dao;

import com.hussir.micromall.model.SoldGoods;

public interface SoldGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SoldGoods record);

    int insertSelective(SoldGoods record);

    SoldGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SoldGoods record);

    int updateByPrimaryKey(SoldGoods record);
}