package org.edc.collabra.abc.main;

import org.edc.collabra.abc.bean.BankAccount;
import org.edc.collabra.abc.bean.Insurance;
import org.edc.collabra.abc.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfiguration {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Insurance insurance = (Insurance) spring.getBean("abcInsurance");
		
		System.out.println(insurance);
		
	}
}
