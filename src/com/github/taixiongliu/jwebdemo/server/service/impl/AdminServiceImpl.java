package com.github.taixiongliu.jwebdemo.server.service.impl;

import com.github.taixiongliu.jweb.AuthorizationInfo;
import com.github.taixiongliu.jweb.enums.UserType;
import com.github.taixiongliu.jwebdemo.server.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private String password = "21232f297a57a5a743894a0e4a801fc3";

	@Override
	public AuthorizationInfo getAdminByAccount(String account) {
		// TODO Auto-generated method stub
		if(!account.equals("admin")){
			return null;
		}
		AuthorizationInfo jo = new AuthorizationInfo();
		jo.setId(1);
		jo.setName("超级管理员");
		jo.setAccount("admin");
		jo.setPasswd(password);
		jo.setUserType(UserType.create(1));
		jo.setAble(true);
		
		return jo;
	}

	@Override
	public boolean updatePassword(String npasswd) {
		// TODO Auto-generated method stub
		this.password = npasswd;
		return true;
	}

}
