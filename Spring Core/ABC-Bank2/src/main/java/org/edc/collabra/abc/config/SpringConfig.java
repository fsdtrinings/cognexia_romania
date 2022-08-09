package org.edc.collabra.abc.config;

import org.edc.collabra.abc.bean.BankAccount;
import org.edc.collabra.abc.bean.DebitCard;
import org.edc.collabra.abc.bean.Insurance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	
	

	@Bean
	public Insurance abcInsurance()
	{
		return new Insurance("ANC", 45454);
	}
}
