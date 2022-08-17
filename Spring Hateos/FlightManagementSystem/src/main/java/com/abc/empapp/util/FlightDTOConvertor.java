package com.abc.empapp.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;

@Component
@Scope("singleton") // understanding
public class FlightDTOConvertor {

	public FlightResponseDTO getFlightReponseDTO(Flight flight)
	{
		FlightResponseDTO dto = new FlightResponseDTO(flight.getFlightId()+"", flight.getFlightName());
		return dto;
		
	}
}
