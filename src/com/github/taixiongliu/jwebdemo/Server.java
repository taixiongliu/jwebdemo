package com.github.taixiongliu.jwebdemo;

import com.github.taixiongliu.jwebdemo.server.BaseService;
import com.github.taixiongliu.jwebdemo.server.DefaultBaseServiceImpl;

public class Server {
	private static Server server = null;
	private BaseService baseService;
	public static Server getInstance(){
		if(server != null){
			return server;
		}
		synchronized (Server.class) {
			if(server == null){
				server = new Server();
			}
		}
		return server;
	}
	private Server() {
		// TODO Auto-generated constructor stub
		baseService = new DefaultBaseServiceImpl();
	}
	public BaseService getBaseService() {
		return baseService;
	}
}
