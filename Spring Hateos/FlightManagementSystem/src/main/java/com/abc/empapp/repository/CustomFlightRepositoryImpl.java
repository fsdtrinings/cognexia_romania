package com.abc.empapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.empapp.entity.Flight;

public class CustomFlightRepositoryImpl implements CustomFlightRepository {

	@Autowired
	EntityManager entityManager;
	
	
	@Override
	public List<Flight> getFlightsBasedOnTypeAndCity1(String searchCity1, String searchedFlightType) {
		
		// code to fetch the output 
		
		String query = "from Flight where city1 = :city1 and flightType =: type"; //JPQL
		TypedQuery<Flight> q = entityManager.createQuery(query,Flight.class);
		q.setParameter("city1", searchCity1);
		q.setParameter("type", searchedFlightType);
		
		//List<Flight> allFlights = (List<Flight>) q.getResultList();
		List<Flight> allFlights = q.getResultList();	
		
		
		return allFlights;
	}

}
