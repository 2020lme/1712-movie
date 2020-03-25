package com.lme.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lme.bean.Shop;
import com.lme.dao.GoodsMapper;
import com.lme.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	GoodsMapper goodsMapper;
	
	@Override
	public List<Shop> list() {
		
		return goodsMapper.listShop();
	}

}
