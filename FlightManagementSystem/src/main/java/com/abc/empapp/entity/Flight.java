package com.abc.empapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/*@GeneratedValue(generator = "sequence-generator")
    (
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "user_sequence"),
        @Parameter(name = "initial_value", value = "4"),
        @Parameter(name = "increment_size", value = "1")
        }
    )*/
	private Long flightId;
	private String flightName;
	private String city1;
	private String city2;
	private String flightType; // domestic or international flight
	
	/*
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightSchedule")
	private Schedule flightSchedule;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightId")
	private List<Seat> seats;
	*/
	
}















