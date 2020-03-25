package com.lme.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lme.bean.Shop;
import com.lme.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	GoodsService service;
	
	@GetMapping("list")
	public String list(Model m) {
		
		List<Shop> list = service.list();
		m.addAttribute("shopList", list);
		
		return "list";
	}
	
}
