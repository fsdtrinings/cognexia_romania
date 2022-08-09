package org.edc.collabra.abc.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class DebitCard {

	private int cardNumber;
	private String cardName;
	
}
