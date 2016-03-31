package com.chuangwl.design.factory;

import com.chuangwl.design.Provider;
import com.chuangwl.design.Sender;
import com.chuangwl.design.impl.SmsSender;

public class SmsSenderFactory  implements Provider{

	@Override
	public Sender productSender() {
		return new SmsSender();
	}

}
