package com.lme.bean;

import java.util.List;

public class Goods {

	private Integer gid;
	private String gname;
	public Goods(Integer gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	public Goods() {
		super();
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + "]";
	}
	
	
	
}
