package org.edc.collabra.abc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.val;

@Data
@NoArgsConstructor
@Component
public class BankAccount{
	
	@Value("101")
	private int accountNumber;
	@Value("${account.name}")
	private String accountHolderName;
	
	private String cityName;
	@Value("#{2000+500}")
	private int balance;
	@Value("#{bankAccount.balance>1000?true:false}")
	private boolean ishighValue;

	@Autowired
	private DebitCard debitCard;
	@Autowired
	private Insurance insurance;
}
