package com.github.taixiongliu.jwebdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private String start;
	private String end;
	private Integer storeId;
	private Integer goodsId;
	public Config() {
		// TODO Auto-generated constructor stub
	}

	public void load() {
		Properties prop = new Properties();
		try {
			// 读取属性文件a.properties
			InputStream in = new BufferedInputStream(new FileInputStream("config.txt"));
			prop.load(in); /// 加载属性列表
			if(prop.getProperty("start") != null){
				start = prop.getProperty("start");
				start = start.trim().equals("")?null:start;
			}
			if(prop.getProperty("storeId") != null){
				try {
					storeId = Integer.parseInt(prop.getProperty("storeId"));
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if(prop.getProperty("goodsId") != null){
				try {
					goodsId = Integer.parseInt(prop.getProperty("goodsId"));
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			in.close();

			/// 保存属性到b.properties文件
//			FileOutputStream oFile = new FileOutputStream("b.properties", true);// true表示追加打开
//			prop.setProperty("phone", "10086");
//			prop.store(oFile, "The New properties file");
//			oFile.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}
}
