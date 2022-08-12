package com.abc.empapp.service;

import java.util.List;
import java.util.Optional;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;

public interface FlightService {

	public FlightResponseDTO addFlight(Flight flight);
	public List<Flight> getAllFlight();
	public Optional<Flight> getFlightById(int id);
	
	public Flight addFlightSchedule(int flightId,int scheduleId)throws Exception;
	
	
}
