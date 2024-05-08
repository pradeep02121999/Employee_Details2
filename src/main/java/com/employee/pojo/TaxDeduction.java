package com.employee.pojo;

import java.time.LocalDate;
import java.util.List;

public class TaxDeduction {
	
	private double salary;
    private double taxamount;
	 
	  
	    private String firstName;
	    private String lastName;
	   
	    
	    public TaxDeduction() {
	    	
	    }
	    @Override
		public String toString() {
			return "TaxDeduction [salary=" + salary + ", taxamount=" + taxamount + ", firstName=" + firstName
					+ ", lastName=" + lastName + "]";
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getTaxamount() {
			return taxamount;
		}
		public void setTaxamount(double taxamount) {
			this.taxamount = taxamount;
		}
		public TaxDeduction(String firstName, String lastName, double salary, double taxamount) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
			this.taxamount = taxamount;
		}
		
}
