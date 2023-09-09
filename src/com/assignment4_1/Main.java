package com.assignment4_1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a class Main having a main method that does the following:
		 * a. It creates a new Employee object employee (you can invent your own
		 * arguments for the constructor)
		 * b. Then it creates a checking account, savings account and retirement account for
		 * employee, each with a starting balance of $300.
		 * c. Then it prints to the console the account data for each of these accounts (making
		 * use of the toString() method that has been provided in Account)
		 * 
		 * */
		
		Employee employee = new Employee("Yonatan", 135000, 2022, 11, 01);
		Account account_1 = new Account(employee, "checking", 300.00);
		Account account_2 = new Account(employee, "savings", 300.00);
		Account account_3 = new Account(employee, "retirement", 300.00);
		
		// printing the data for each account
		System.out.println("The data for the specified account: "+account_1.toString());
		System.out.println("The data for the specified account: "+account_2.toString());
		System.out.println("The data for the specified account: "+account_3.toString());
		
		// employee data
		System.out.println("Employee Name: "+employee.getName());
		System.out.println("Employee Salary: "+employee.getSalary()+" USD");
		System.out.println("Employee Hireday: "+employee.getHireDay());
	}

}
