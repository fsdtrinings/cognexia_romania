package com.demo.aop.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
	@Value("101")
	private int accountNumber;
	@Value("Mike")
	private String name;
	@Value("800")
	private int balance;
	
	
}
