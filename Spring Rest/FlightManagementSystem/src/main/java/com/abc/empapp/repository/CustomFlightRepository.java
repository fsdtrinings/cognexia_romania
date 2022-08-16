package com.abc.empapp.repository;

import java.util.List;

import com.abc.empapp.entity.Flight;

public interface CustomFlightRepository 
{
	public List<Flight> getFlightsBasedOnTypeAndCity1(String city1,String flightType);
}
