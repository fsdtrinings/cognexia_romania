package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.EmployeeServiceImpl;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	EmployeeServiceImpl empService;
	
	@Mock
	EmployeeDAO dao;
	
	Employee sampleEmployee;
	
	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testAllEmployee() throws Exception
	{
		// given 
		Employee e1 = new Employee("A", 2000, "Delhi");
		Employee e2 = new Employee("vfdg", 12000, "New York");
		
		
		BDDMockito.given(dao.getAllEmployees()).willReturn(List.of(e1,e2));
		
		// When : - the action , which we want to test
		
		List<Employee> actualData = empService.getAllEmployees();
		
		// then : verify the output
		assertThat(actualData).isNotNull();
		assertThat(actualData.size()).isEqualTo(2);
	}
	
	@Test
	public void givenEmployeeName_whenGetEmployeeByName_thenReturnEmployeeSalary() throws Exception{
		// given
		Employee e1 = new Employee("A", 2000, "Delhi");
		int sampleOutput = 2000;
		String sampleEmployeeName = "A";
		
		BDDMockito.given(dao.getSalary(sampleEmployeeName)).willReturn(sampleOutput);
		
		// --- when : do actual testing
		int actualOutput = empService.getEmployeeSalaryByName(sampleEmployeeName);
		
		// verify
		assertEquals(sampleOutput, actualOutput);
		
	}
	
	
	@Test
	public void givenEmployee_whenGetEmployeeByName_thenReturnEmployeeObject() throws Exception{
		// given
		Employee e1 = new Employee("A", 2000, "Delhi");
		Employee sampleOutput = new Employee("A", 2000, "Delhi");
		
		String sampleEmployeeName = "A";
		
		BDDMockito.given(dao.getEmployeeByName(sampleEmployeeName)).willReturn(sampleOutput);
		
		// --- when : do actual testing
		Employee actualOutput = empService.getEmployeeByName(sampleEmployeeName);
		
		// verify
		assertEquals(sampleOutput, actualOutput);
		
	}
	
	
	
	
	
	@Test
	public void givenEmployeeList_whenGetEmployeeByLocation_thenReturnEmployeeList() throws Exception{
		
		// given 
		Employee e1 = new Employee("A", 2000, "Delhi");
		Employee e2 = new Employee("vfdg", 12000, "New York");
		String sampleLocation = "Delhi";
		List<Employee> sampleOutput = new ArrayList<>();
		sampleOutput.add(e1);
		
		BDDMockito.given(dao.getEmployeeByLocation(sampleLocation)).willReturn(sampleOutput);
		
		
		
		// --- when : do actual testing
		List<Employee> actualOutput = empService.getAllEmployeeByLocation(sampleLocation);
		
		
		// verify
		assertEquals(sampleOutput, actualOutput);
		
	}
	
	
	

}









