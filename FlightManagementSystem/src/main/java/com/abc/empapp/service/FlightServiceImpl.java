package com.abc.empapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.empapp.dto.FlightResponseDTO;
import com.abc.empapp.entity.Flight;
import com.abc.empapp.entity.Schedule;
import com.abc.empapp.repository.FlightRepository;
import com.abc.empapp.repository.ScheduleRepository;
import com.abc.empapp.util.FlightDTOConvertor;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	FlightDTOConvertor dtoConvertor;
	
	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Override
	public FlightResponseDTO addFlight(Flight flight) {
		
		Flight savedFlight = flightRepository.save(flight);
		return dtoConvertor.getFlightReponseDTO(savedFlight);
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return flightRepository.findAll();
	}

	@Override
	public Optional<Flight> getFlightById(int id) {
		// TODO Auto-generated method stub
		return flightRepository.findById(id);
	}

	@Override
	@Transactional
	public Flight addFlightSchedule(int flightId,int scheduleId)throws Exception
	{
		
		Schedule schedule = scheduleRepository.findById(scheduleId).get();
		
		if(schedule != null)
		{
			Flight f = flightRepository.findById(flightId).get();
			if(f != null)
			{
				f.setFlightSchedule(schedule);
				Flight updatedFlight = flightRepository.save(f);
				return updatedFlight;
			}
			else
			{
				throw new Exception("Invalid FLight Id "+flightId);
			}
		}
		else
		{
			throw new Exception("Invalid Schedule  Id "+scheduleId);
		}
		
		
	}

	
}
