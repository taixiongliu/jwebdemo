package com.github.taixiongliu.jwebdemo.activity;

import com.github.taixiongliu.jweb.ComponentBean;
import com.github.taixiongliu.jweb.Session;
import com.github.taixiongliu.jweb.application.Activity;
import com.github.taixiongliu.jweb.core.JWebContext;
import com.github.taixiongliu.jweb.core.JWebElement;
import com.github.taixiongliu.jweb.core.JWebLabel;

public class EmptyActivity extends Activity{

	public EmptyActivity(ComponentBean bean, Session session) {
		super(bean, session);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreateView(JWebContext context, JWebElement arg1) {
		// TODO Auto-generated method stub
		JWebLabel label = new JWebLabel(context, "hello,this is empty activity page.");
		arg1.appendChild(label);
	}
}
