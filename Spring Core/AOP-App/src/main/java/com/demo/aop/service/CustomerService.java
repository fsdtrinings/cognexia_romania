package com.demo.aop.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	
	public void abc()
	{
		doCustomerThings();
	}
	private void doCustomerThings()
	{
		System.out.println(" Customer Service - doCustomerThings called ");
	}
}
