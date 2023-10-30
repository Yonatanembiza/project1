package com.assignment4_2;
import java.util.*;

//same as the Employee class defined in the lecture
class Employee {
	
	//instance fields
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;

	private String name;
	private double salary;
	//private Date hireDay;
	private Date hireDay;
	
	//constructor
	Employee(String aName, int aYear,
	       int aMonth, int aDay) {
		this.name = aName;
		//this.salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear,aMonth-1,aDay);
		this.hireDay = cal.getTime();
	
	}
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}
	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		// implement
		switch (acctType) {
		
			case CHECKING:{
				checkingAcct.makeDeposit(amt);
				break;
			} case SAVINGS: {
				savingsAcct.makeDeposit(amt);
				break;
			} case RETIREMENT: {
				retirementAcct.makeDeposit(amt);
				break;
			} default: {
				System.out.println("There is no such account!");
			}			
			
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		switch (acctType) {
		
			case CHECKING:{
				if (checkingAcct.getBalance() < amt) {
					return false;
				}
				checkingAcct.makeWithdrawal(amt);
				return true;
			} case SAVINGS: {
				if (savingsAcct.getBalance() < amt) {
					return false;
				}
				savingsAcct.makeWithdrawal(amt);
				return true;
			} case RETIREMENT: {
				if (retirementAcct.getBalance() < amt) {
					return false;
				}
				retirementAcct.makeWithdrawal(amt);
				return true;
			} default: {
				System.out.println("There is no such account!");
				return false;
			}			
		
		}
	}

	public String getFormattedAcctInfo() {
		// implement
		return checkingAcct.toString() + " \n" + savingsAcct.toString() + " \n" + retirementAcct.toString();
	}

	
	//instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//needs to be improved!!
	public Date getHireDay() {
		return hireDay;
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

