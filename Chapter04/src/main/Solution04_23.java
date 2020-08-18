package main;

import java.util.Scanner;

/*
 * (Financial application: payroll)
 * Write a program that reads the following information and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * 
 */

public class Solution04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = input.next();
		System.out.println("Enter number of hours worked in a week: ");
		double weekWorkingHours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		double grossPay = (weekWorkingHours * payRate);
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + weekWorkingHours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.printf("Deductions:\n\tFederal Withholding (%.1f%%): $%.2f\n\tState Withholding (%.1f%%): $%.2f\n\tTotal Deduction: $%.2f\nNet Pay: $%.2f"
				,(federalTax * 100)
				,(grossPay * federalTax)
				,(stateTax * 100)
				,(grossPay * stateTax)
				,((grossPay * federalTax)+(grossPay * stateTax))
				,(grossPay - ((grossPay * federalTax)+(grossPay * stateTax))));
				
		input.close();
	}

}
