package com.employee.webemployee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class EmployeeController
{
	//	Get all Employee Data
	@GetMapping(value = "/allemployees", produces = {"application/json"})
	public ResponseEntity<?> getAllEmloyees()
	{
		return new ResponseEntity<>(WebemployeeApplication.ourEmpList.empList, HttpStatus.OK);
	}
	//	Get Specific Employee by ID
	@GetMapping(value = "/employee/{id}", produces = {"application/json"})
	public ResponseEntity<?> getEmpDetails(@PathVariable long id)
	{
		Employee rtnEmp  = WebemployeeApplication.ourEmpList.findEmployee(e -> e.getId() == id);
		return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
	}
	// Filter Employees based on fname Search
	@GetMapping(value = "/employees/{letter}", produces = {"application/json"})
	public ResponseEntity<?> getEmpDetails(@PathVariable Character letter)
	{
		ArrayList<Employee> rtnList  = WebemployeeApplication.ourEmpList.findEmployees(e -> e.getFname().toUpperCase().charAt(0) == Character.toUpperCase(letter));
		return new ResponseEntity<>(rtnList, HttpStatus.OK);
	}

	// Get sorted alphabetical Fname Search
	@GetMapping(value = "/employee/{letter}", produces = {"application/json"})
	public ResponseEntity<?> getEmpDetails(@PathVariable String letter)
	{
		Employee rtnEmp  = WebemployeeApplication.ourEmpList.findEmployee(e -> e.getId() == id);
		return new ResponseEntity<>(, HttpStatus.OK);
	}


}
