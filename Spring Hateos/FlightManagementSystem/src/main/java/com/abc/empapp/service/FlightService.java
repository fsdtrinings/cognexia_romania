package com.abc.empapp.service;

import java.util.List;
import java.util.Optional;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;
import com.abc.empapp.exception.NoFLightException;

public interface FlightService {

	public FlightResponseDTO addFlight(Flight flight);
	public List<Flight> getAllFlight();
	public List<Flight> getAllFlights(String sort);
	public List<Flight> getAllFlightsByType(String type);
	public List<Flight> getAllFlightsByTypeAndCity(String city , String type);
	
	public Optional<Flight> getFlightById(int id)throws NoFLightException;
	
	public Flight addFlightSchedule(int flightId,int scheduleId)throws Exception;
	
	
}
