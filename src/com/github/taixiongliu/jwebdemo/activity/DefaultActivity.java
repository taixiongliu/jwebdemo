package com.github.taixiongliu.jwebdemo.activity;

import com.github.taixiongliu.jweb.ComponentBean;
import com.github.taixiongliu.jweb.Session;
import com.github.taixiongliu.jweb.core.JWebContext;
import com.github.taixiongliu.jweb.core.JWebLabel;
import com.github.taixiongliu.jweb.core.JWebLayout;
import com.github.taixiongliu.jweb.widget.ListInfoWidget;

public class DefaultActivity extends BaseActivity{

	public DefaultActivity(ComponentBean bean, Session session) {
		super(bean, session);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onView(JWebContext context, JWebLayout root) {
		// TODO Auto-generated method stub
		JWebLayout layout = new JWebLayout(context,"default_view");
		layout.setAlign("center");
		JWebLabel label = new JWebLabel(context, "欢迎使用XXXX数据管理系统!","default_title");
		layout.addView(label);
		
		ListInfoWidget widget = new ListInfoWidget(context);
		widget.addItemView("title", "info", "#text");
		widget.addItemView("title", "info", "#text");
		
		root.addView(layout);
		root.addView(widget);
	}
}
