package com.abc.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;
import com.abc.empapp.entity.Schedule;
import com.abc.empapp.repository.FlightRepository;
import com.abc.empapp.repository.ScheduleRepository;
import com.abc.empapp.service.FlightService;

@RestController
@RequestMapping("/abcflights")
public class FlightRestController {

	@Autowired
	FlightService flightService;
	
	@Autowired
	ScheduleRepository scheduleRepository;
	
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
	
	@PostMapping("/schedule")
	public Schedule addSchedule(@RequestBody Schedule schedule) {
		return scheduleRepository.save(schedule);
	}
	
	@PutMapping("/flight")
	public ResponseEntity<Flight> updateSchedule(@RequestParam int flightId,@RequestParam int scheduleId)throws Exception
	{
		Flight updatedFlight = flightService.addFlightSchedule(flightId, scheduleId);
		System.out.println(updatedFlight);
		return new ResponseEntity<Flight>(updatedFlight,HttpStatus.OK);
	}
}


























// localhost : 8010/abcflights/flights