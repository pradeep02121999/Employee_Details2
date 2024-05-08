package com.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Entity.Employee;
import com.employee.pojo.TaxDeduction;
import com.employee.service.EmployeeInterfaceImpl;






@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeInterfaceImpl employeeService;

    @PostMapping
    public ResponseEntity<String> createEmployee(@Validated @RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee created successfully");
    }
    
    
    
    @GetMapping("/id/{id}")
   	public ResponseEntity<TaxDeduction> getIncidentById(@PathVariable("id") int empid){
    	TaxDeduction ls = employeeService.getObjectById(empid);
    	  return ResponseEntity.status(HttpStatus.CREATED).body(ls);
   		
   	
   
   
   
    	
    	  
}}
