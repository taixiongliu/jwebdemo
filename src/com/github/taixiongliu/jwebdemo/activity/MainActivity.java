package com.github.taixiongliu.jwebdemo.activity;

import com.github.taixiongliu.jweb.ComponentBean;
import com.github.taixiongliu.jweb.Session;
import com.github.taixiongliu.jweb.core.JWebContext;
import com.github.taixiongliu.jweb.core.JWebLabel;
import com.github.taixiongliu.jweb.core.JWebLayout;

public class MainActivity extends BaseActivity{
	
	public MainActivity(ComponentBean bean, Session session) {
		super(bean, session);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onView(JWebContext context, JWebLayout root) {
		// TODO Auto-generated method stub
		//alert("ele load...");
		//JWebLayout layout = new JWebLayout(context, "layout","panel");
		//log(layout);
		//root.appendChild(layout);
		JWebLabel label = new JWebLabel(context, "Hello word! this is demo page.");
		root.addView(label);
	}
}
