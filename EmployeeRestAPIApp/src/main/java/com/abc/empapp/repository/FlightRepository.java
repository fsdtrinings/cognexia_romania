package com.abc.empapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.empapp.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>
{

	
}
