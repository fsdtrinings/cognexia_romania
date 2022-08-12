package com.abc.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;
import com.abc.empapp.repository.FlightRepository;
import com.abc.empapp.service.FlightService;

@RestController
@RequestMapping("/abcflights")
public class FlightRestController {

	@Autowired
	FlightService flightService;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights()
	{
		return flightService.getAllFlight();
	}
	
	@GetMapping("/flight/{flightid}")
	public Flight getFlightBasedOnId(@PathVariable int flightid)
	{
		return flightService.getFlightById(flightid).get();
	}
	
	@PostMapping("/flight")
	public ResponseEntity<FlightResponseDTO> saveFlight(@RequestBody Flight flight)
	{
		
		FlightResponseDTO dto = flightService.addFlight(flight);
		
		return new ResponseEntity<FlightResponseDTO>(dto, HttpStatus.CREATED);
	}
	
	
}


// localhost : 8010/abcflights/flights