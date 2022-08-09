package org.edc.collabra.abc.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class Insurance {

	private String insuranceName;
	private int premiumValue;
}
