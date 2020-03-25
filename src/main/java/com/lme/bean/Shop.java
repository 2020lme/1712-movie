package com.lme.bean;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Shop {

	private Integer sid;
	private String sname;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date creat;
	private List<Goods> goods;
	public Shop(Integer sid, String sname, Date creat, List<Goods> goods) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.creat = creat;
		this.goods = goods;
	}
	public Shop() {
		super();
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getCreat() {
		return creat;
	}
	public void setCreat(Date creat) {
		this.creat = creat;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", creat=" + creat + ", goods=" + goods + "]";
	}
	
	
}
