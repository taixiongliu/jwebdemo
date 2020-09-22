package com.github.taixiongliu.jwebdemo.server;

import com.github.taixiongliu.jwebdemo.server.service.AdminService;
import com.github.taixiongliu.jwebdemo.server.service.impl.AdminServiceImpl;

/**
 * 默认业务模块处理实现体
 * @author ltx
 *
 */
public class DefaultBaseServiceImpl implements BaseService{
	private AdminService adminService;
	public DefaultBaseServiceImpl() {
		// TODO Auto-generated constructor stub
		adminService = new AdminServiceImpl();
	}
	@Override
	public AdminService getAdminService() {
		// TODO Auto-generated method stub
		return adminService;
	}
}
