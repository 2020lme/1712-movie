package com.lme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lme.bean.Goods;
import com.lme.bean.Shop;

public interface GoodsMapper {

	List<Shop> listShop();
	List<Goods> findBySid(@Param("sid")Integer sid);
	
}
