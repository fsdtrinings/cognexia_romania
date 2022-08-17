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
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight extends RepresentationModel<Flight> 
{

	
	//@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="MySequenceGenerator")
	@SequenceGenerator(allocationSize=1, initialValue = 100, schema="myschema",  name="MySequenceGenerator", sequenceName = "mysequence")
	private int flightId;
	@NotNull(message = "Flight Name cannot be Null")
	@Pattern(regexp = "[A-Z]{3}[0-9]{3}" , message = "Invalid Flight Name")   // abc123
	private String flightName;
	@NotNull(message = "City Name cannot be left Blank")
	private String city1;
	@NotNull(message = "City Name cannot be left Blank")
	private String city2;
	@NotNull(message = "Flight Type cannot be left Blank")
	private String flightType; // domestic or international flight
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightSchedule")
	private Schedule flightSchedule;
	
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightId")
	private List<Seat> seats;
	*/
	
}















