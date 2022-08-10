package com.demo.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.aop.bean.BankAccount;
import com.demo.aop.service.AccountService;
import com.demo.aop.service.CustomerService;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		BankAccount account = spring.getBean("bankAccount",BankAccount.class);
		AccountService service = spring.getBean("accountService",AccountService.class);
		CustomerService customerService = (CustomerService)spring.getBean("customerService");
		
		
		//int newBalance = service.doDeposit(account, 5000);
		//System.out.println(" User code :- "+newBalance);
		
		try {
		

			int transactionAmount = service.doWithdrawal(account, 300);
			System.out.println(" User code :- "+transactionAmount);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println("Balance Check :- "+service.checkBalance(account));
		
		//service.doAccountsThings();
		//customerService.abc();
		
		/*
		int newBalance = service.doDeposit(account, 7000);
		
		System.out.println(newBalance);
		*/
		
	}
}
