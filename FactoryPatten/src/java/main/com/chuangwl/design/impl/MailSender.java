package com.chuangwl.design.impl;

import com.chuangwl.design.Sender;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("mail  send....s");
	}

}
