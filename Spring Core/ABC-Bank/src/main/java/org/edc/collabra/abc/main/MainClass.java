package org.edc.collabra.abc.main;

import org.edc.collabra.abc.bean.BankAccount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-cofg.xml");
		
		BankAccount account = (BankAccount) spring.getBean("account1");
		
		System.out.println(account);
		
	}
}
