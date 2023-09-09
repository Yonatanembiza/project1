package com.assignment4_1;
import java.text.SimpleDateFormat;
import java.util.*;

//same as the Employee class defined in the lecture
class Employee {
	
	//instance fields
	private String name;
	private double salary;
	private GregorianCalendar hireDay;
	
	//constructor
	Employee(String aName, double aSalary, int aYear,
	       int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = new GregorianCalendar(aYear,aMonth-1,aDay);
		//hireDay = cal;//.getTime();
	
	}
	
	//instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//needs to be improved!!
	public String getHireDay() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		return dateFormat.format(hireDay.getTime());
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	// A method, yearlyFederalTax  used computes the yearly federal tax on the salary
	/* 
	 * If the salary is greater than $80,000 then the tax is 28% of the salary.
	 * If the salary is greater than $50,000 and  <=  $80,000  then the tax is 24% of the salary.
	 * If the salary is greater than $26,000  and  <=  $50,000  then the tax is 20% of the salary.
	 * If the salary is  <=  $26,000  then there is no tax. 
	 * */
	
	public double yearlyFederalTax() {
		if ( this.salary > 80000 ) {
			return 0.28;
		} else if ( this.salary > 50000 && this.salary <= 80000 ) {
			return 0.24;
		} else if ( this.salary > 26000 && this.salary <= 50000) {
			return 0.20;
		}  else if ( this.salary <= 26000 ) {
			return 0.00;
		} else {
			System.out.println("Invalid Entry!");
			return -1.00;
		}
		
	}
	
}

