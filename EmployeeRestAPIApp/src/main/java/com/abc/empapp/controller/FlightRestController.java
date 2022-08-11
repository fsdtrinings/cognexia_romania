package com.abc.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.empapp.entity.Flight;
import com.abc.empapp.repository.FlightRepository;

@RestController
@RequestMapping("/abcflights")
public class FlightRestController {

	@Autowired
	FlightRepository flightRepository;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights()
	{
		return flightRepository.findAll();
	}
	
	@GetMapping("/flight/{flightid}")
	public Flight getFlightBasedOnId(@PathVariable int flightid)
	{
		return flightRepository.findById(flightid).get();
	}
}


// localhost : 8010/abcflights/flights