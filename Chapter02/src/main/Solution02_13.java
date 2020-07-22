package main;

import java.util.Scanner;

/*
 * (Financial application: compound value) Suppose you save $100 each month into a savings account with the annual interest rate 5%.
 * Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 			100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * 			(100 + 100.417) * (1 + 0.00417) = 201.25
 * After the third month, the value in the account becomes
 * 			(100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
 * (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 */

public class Solution02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterest = input.nextDouble();
		System.out.println("How many months after deposit the money?");
		int month = input.nextInt();
		double interestRate = annualInterest / 100.0 / 12;
		double totalMoney = 0;
		double newMonthSaving = 0;
		for(int i = 0; i < month; i++) {
			newMonthSaving = (savingAmount + newMonthSaving) * (1 + interestRate);
			totalMoney = newMonthSaving;
		}
		System.out.println("After the " + month + " months, the account value is " + (float)totalMoney);
		
		input.close();
		

	}

}
