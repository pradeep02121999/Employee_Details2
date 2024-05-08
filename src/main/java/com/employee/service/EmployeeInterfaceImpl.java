package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.Employee;
import com.employee.pojo.TaxDeduction;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeInterfaceImpl implements EmployeeService{

	
	 @Autowired
	    private EmployeeRepo employeeRepository;

	    @Override
	    public void saveEmployee(Employee employee) {
	        employeeRepository.save(employee);
	    }

		@Override
		public TaxDeduction getObjectById(int id) {
			Employee emp =employeeRepository.findById(id).get();
			
			TaxDeduction	tx =new  TaxDeduction();
			double yearlySalary = emp.getSalary();
			   if (yearlySalary <= 250000) {
				  
				   
		          tx.setFirstName(emp.getFirstName());  
		           tx.setLastName( emp.getLastName()); 
		           tx.setSalary(yearlySalary);
		            tx.setTaxamount(0);
		            tx.setSalary(yearlySalary);
		            return tx;
		            
		        }
			   
			   else if (yearlySalary > 250000 && yearlySalary <= 500000) {
		            double sa = (yearlySalary - 250000) * 0.05;
		            
		            tx.setFirstName(emp.getFirstName());  
			           tx.setLastName( emp.getLastName()); 
			           tx.setSalary(yearlySalary);
			            tx.setTaxamount(sa);
			            return tx;
		        }
			   
			   else if (yearlySalary > 500000 && yearlySalary <= 1000000) {
		           double  sa2 = 12500 + (yearlySalary - 500000) * 0.1;
		            tx.setFirstName(emp.getFirstName());  
			           tx.setLastName( emp.getLastName()); 
			           tx.setSalary(yearlySalary);
			            tx.setTaxamount(sa2);
			            return tx;
		        } 
			   
		   
			 
			   return tx;
		}
		
		

		
		

	
		
		

		

		
		
}
