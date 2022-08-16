package com.abc.empapp.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
import com.abc.empapp.exception.NoFLightException;
import com.abc.empapp.repository.FlightRepository;
import com.abc.empapp.repository.ScheduleRepository;
import com.abc.empapp.service.FlightService;

@RestController
@RequestMapping("/abc-flights")
@Validated
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
	
	
	@GetMapping("/sorted/flights") // endpoint :- localhost:8010/abc-flights/sorted/flights?sort=name
	public List<Flight> getAllFlightsBasedOnSorting(@RequestParam String sort)
	{
		return flightService.getAllFlights(sort);
	}
	
	
	
	@GetMapping("/flight/{flightid}")
	public Flight getFlightBasedOnId(@PathVariable int flightid )throws NoSuchElementException,NoFLightException
	{
		try
		{
			return flightService.getFlightById(flightid).get();
		}
		catch (Exception e) {
			System.out.println(" -- inside catch flight controller");
			throw new NoFLightException(flightid+"", "No Flight Available for "+flightid,"FlightController");
		}
		
	}
	
	@PostMapping("/flight")
	public ResponseEntity<FlightResponseDTO> saveFlight(@RequestBody @Valid Flight flight)
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


	@GetMapping("/type/flights") // .... /type/flights?type=International
	public ResponseEntity<List<Flight>> getFlightsBasedOnType(@RequestParam String type)
	{
		List<Flight> allFlightsByType = flightService.getAllFlightsByType(type);
		
		return new ResponseEntity<List<Flight>>(allFlightsByType,HttpStatus.OK);
		
		
	}

	@GetMapping("/fetch/flights") // .... /type/flights?type=International
	public ResponseEntity<List<Flight>> getFlightsBasedOnTypeAndCity(
												@RequestParam String type,
												@RequestParam String city
																)
	{
		List<Flight> allFlightsByType = flightService.getAllFlightsByTypeAndCity(city, type);
		
		return new ResponseEntity<List<Flight>>(allFlightsByType,HttpStatus.OK);
		
		
	}




}//end of controller


























// localhost : 8010/abcflights/flights