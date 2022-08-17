package com.abc.empapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abc.empapp.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>,
CustomFlightRepository
{

   
	@Query("From Flight where flightType = :searchedType")
	public List<Flight> getAllFlightsBasedOnType(@Param("searchedType") String searchedType);
	
}


// String query = 