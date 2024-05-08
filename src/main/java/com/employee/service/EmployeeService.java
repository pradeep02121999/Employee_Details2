package com.employee.service;

import java.util.Optional;

import com.employee.Entity.Employee;
import com.employee.pojo.TaxDeduction;



	
	public interface EmployeeService {
	    void saveEmployee(Employee employee);
	    
	    public TaxDeduction getObjectById(int id );
	   
	   
	   
	
}