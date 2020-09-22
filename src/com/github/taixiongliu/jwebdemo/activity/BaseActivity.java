package com.github.taixiongliu.jwebdemo.activity;

import com.github.taixiongliu.jweb.AuthorizationInfo;
import com.github.taixiongliu.jweb.ComponentBean;
import com.github.taixiongliu.jweb.Session;
import com.github.taixiongliu.jweb.application.AppcompatActivity;
import com.github.taixiongliu.jweb.base.JSBase;
import com.github.taixiongliu.jweb.core.JWebConfirm;
import com.github.taixiongliu.jweb.core.JWebContext;
import com.github.taixiongliu.jweb.handler.ItemClickHandler;
import com.github.taixiongliu.jweb.widget.LineMenuWidget;

public abstract class BaseActivity extends AppcompatActivity{
	
	public BaseActivity(ComponentBean bean, Session session) {
		super(bean, session);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String userName() {
		// TODO Auto-generated method stub
		AuthorizationInfo info = (AuthorizationInfo)session.getEntity();
		return info.getName();
	}
	
	@Override
	public String systemName() {
		// TODO Auto-generated method stub
		return "XX数据管理系统";
	}

	@Override
	public String bottomInfo() {
		// TODO Auto-generated method stub
		return "成都XXXX科技有限公司 - http://www.xxxxxx.com";
	}
	
	@Override
	public void onMenus(LineMenuWidget arg0) {
		// TODO Auto-generated method stub
		JSBase palert = new JSBase("palert", confirm);
		arg0.addMenu("icons/icon_menuitem.png", "自定义菜单", new ItemClickHandler(context, palert) {
			
			@Override
			public void onHandler(JWebContext ct2) {
				// TODO Auto-generated method stub
				//ct2.alert("sasa");
				JWebConfirm alert = (JWebConfirm)getProperty("palert");
				alert.show();
			}
		});
	}
}
