package com.demo.aop.service;

import org.springframework.stereotype.Component;

import com.demo.aop.bean.BankAccount;

@Component
public class AccountService {

	public void doAccountsThings()
	{
		System.out.println(" AccountService  - doAccountThings called ");
	}
	
	public int checkBalance(BankAccount account)
	{
		return account.getBalance();  // more code related to DB
	}
	
	public int doDeposit(BankAccount account , int amount)  // returns current balance
	{
		account.setBalance(account.getBalance()+amount);
		
		return account.getBalance();
	}
	
	public int doWithdrawal(BankAccount account , int amount)throws Exception     // returns transaction amount
	{
		int currentBalance = account.getBalance();
		
		if(currentBalance>5000)
		{
			account.setBalance(account.getBalance()-amount);
			return amount;
		}
		else {
			throw new Exception("Balance is less than 5000");
		}
		
	}
	
	
}
