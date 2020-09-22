package com.github.taixiongliu.jwebdemo.server.service;

import com.github.taixiongliu.jweb.AuthorizationInfo;

public interface AdminService {
	public AuthorizationInfo getAdminByAccount(String account);
	public boolean updatePassword(String npasswd);
}
