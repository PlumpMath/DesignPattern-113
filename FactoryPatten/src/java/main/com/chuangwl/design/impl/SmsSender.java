package com.chuangwl.design.impl;

import com.chuangwl.design.Sender;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("  sms  send.......");
	}

	
}
