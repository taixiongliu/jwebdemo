package com.github.taixiongliu.jwebdemo;

import com.github.taixiongliu.hapi.HapiHttpContextFactory;
import com.github.taixiongliu.hapi.ssl.KeystoreEntity;
import com.github.taixiongliu.jweb.JWebContextFactory;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	JWebContextFactory.getInstance().createContext("jweb-context.xml");
        KeystoreEntity entity = new KeystoreEntity("netty.keystore","123456","123456");
        HapiHttpContextFactory.getInstance().buildHttps(entity).createContext("hapi-context.xml");
    }
}
