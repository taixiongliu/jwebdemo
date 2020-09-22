package com.github.taixiongliu.jwebdemo.route;

import com.github.taixiongliu.hapi.route.Route;
import com.github.taixiongliu.jweb.AuthorizationInfo;
import com.github.taixiongliu.jweb.ComponentBean;
import com.github.taixiongliu.jweb.Session;
import com.github.taixiongliu.jweb.application.Activity;
import com.github.taixiongliu.jweb.application.AppcompatRoute;
import com.github.taixiongliu.jwebdemo.Server;
import com.github.taixiongliu.jwebdemo.activity.DefaultActivity;
import com.github.taixiongliu.jwebdemo.activity.MainActivity;
import com.github.taixiongliu.jwebdemo.activity.UserActivity;

@Route
public class Index extends AppcompatRoute{

	@Override
	public AuthorizationInfo getAuthorizationInfo(String account) {
		// TODO Auto-generated method stub
		return Server.getInstance().getBaseService().getAdminService().getAdminByAccount(account);
	}

	@Override
	public Activity onCreatePage(ComponentBean component, Session session) {
		// TODO Auto-generated method stub
		if(component == null){
			return new DefaultActivity(component,session);
		}
		System.out.println("漏网ID（没有设置自动处理activity）："+component.getId());
		Activity activity = new DefaultActivity(component,session);
		switch (component.getId()) {
		case 1:
			activity = new MainActivity(component,session);
			break;
		case 2:
			activity = new UserActivity(component,session);
			break;

		default:
			break;
		}
		return activity;
	}

	@Override
	public boolean updatePassword(AuthorizationInfo arg0, String arg1) {
		// TODO Auto-generated method stub
		return Server.getInstance().getBaseService().getAdminService().updatePassword(arg1);
	}
}
