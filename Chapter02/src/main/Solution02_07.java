package main;

import java.util.Scanner;

/*
 * (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days.
 */

public class Solution02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		int days = minutes % (365 * 24 * 60);
		int years = minutes / (365 * 24 * 60);
		days /= (24 * 60);
		
		System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
		

	}

}
