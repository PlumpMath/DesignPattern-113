package com.chuangwl.design.test;

import org.junit.Test;

import com.chuangwl.design.factory.MailSenderFactory;
import com.chuangwl.design.factory.SenderFactory;
import com.chuangwl.design.factory.SmsSenderFactory;

/**
 * 
 * @author Administrator
 *
 */
public class OrdinaryTest {
	
	@Test
	public void test1() {
		SenderFactory factory=new SenderFactory();
		factory.produceMail().send();
		factory.produceSms().send();
		
	}
	@Test
	public void test2(){
		MailSenderFactory factory=new MailSenderFactory();
		factory.productSender().send();
		
		SmsSenderFactory factory2=new SmsSenderFactory();
		factory2.productSender().send();
	}
}
