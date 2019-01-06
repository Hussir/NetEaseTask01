package com.hussir.micromall.dao;

import com.hussir.micromall.model.CartGoods;

public interface CartGoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(CartGoods record);

    int insertSelective(CartGoods record);

    CartGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(CartGoods record);

    int updateByPrimaryKey(CartGoods record);
}