package org.edc.collabra.abc.dump;

import org.edc.collabra.abc.bean.BankAccount;

public class TestClass {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setCityName("New Delhi");
		
		System.out.println(account.getCityName());
		
	}
}
