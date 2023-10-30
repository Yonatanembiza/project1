package com.assignment4_2;

class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	
	// Constructor
	Account(Employee emp, AccountType acctType, double balance){
		this.employee = emp;
		this.acctType =acctType;
		this.balance = balance;
	}
	
	// Constructor
	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	
	public String toString() {
		return "Customer Name: "+employee.getName()+", Accnt Type: "+this.acctType+", Available Balance: "+this.balance+" USD";
	}
	
	// accessor method for acctType
	public AccountType getAcctType() {
		return acctType;
	}
	
	// accessor method for balance
	public double getBalance() {
		return balance;
	}
	
	public void makeDeposit(double deposit) {
		//implement
		//
		balance += deposit;
	}
	
	public boolean makeWithdrawal(double amount) {
		//implement
		//updates the balance field and returns true, unless
		//withdrawal amount is too large; in that case,
		//it does not modify the balance field, and returns false
		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	/*
	 * Write a method to the Account class called ‘computeInterest’.
	 * The method returns the yearly interest amount for that account.
	 * If the account is a checking account then the interest  =  balance * 0.02
	 * If the account is a savings account then the interest  =  balance * 0.04
	 * If the account is a retirement account then the interest  =  balance * 0.05
	 * The signature and return type of the method is      double computeInterest();
	 * 
	 */
	
	public double computeInterest() {
		
		switch(acctType){
			case CHECKING :{
				return balance * 0.02;
			} 
			case SAVINGS :{
				return balance * 0.04;
			} 
			case RETIREMENT :{
				return balance * 0.05;
			} 
			default: {
				System.out.println("Invalid Entry!");
				return -1.0;
			}
		}
	}
}

