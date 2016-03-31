package com.chuangwl.design.test;

import com.chuangwl.design.factory.SenderFactory;

/**
 * 
 * @author Administrator
 *
 */
public class OrdinaryTest {
	
	public static void main(String[] args) {
		
		SenderFactory factory=new SenderFactory();
		factory.produceMail().send();
		factory.produceSms().send();
		
	}
}
