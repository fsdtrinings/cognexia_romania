package org.edc.collabra.abc.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccount{
	
	private int accountNumber;
	private String accountHolderName;
	private String cityName;
	private int balance;

	private DebitCard debitCard101;
	private Insurance insurance101;
}
