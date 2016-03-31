package com.chuangwl.design.factory;

import com.chuangwl.design.Sender;
import com.chuangwl.design.impl.MailSender;
import com.chuangwl.design.impl.SmsSender;

public class SenderFactory {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}

}
