package main;

import java.util.Scanner;

/*
 * (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day and dis- play the future day of the week. 
 */

public class Solution03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDay = input.nextInt();
		
		System.out.print("Today is ");
		
		switch(today % 7) {
			case 0:
				System.out.print("Sunday ");
				break;
			case 1:
				System.out.print("Monday ");
				break;
			case 2:
				System.out.print("Tuesday ");
				break;
			case 3:
				System.out.print("Wednesday ");
				break;
			case 4:
				System.out.print("Thursday ");
				break;
			case 5:
				System.out.print("Friday ");
				break;
			case 6:
				System.out.print("Saturday ");
				break;
		}
		
		System.out.print("and the future day is ");
		
		switch((today + elapsedDay) % 7) {
		case 0:
			System.out.print("Sunday ");
			break;
		case 1:
			System.out.print("Monday ");
			break;
		case 2:
			System.out.print("Tuesday ");
			break;
		case 3:
			System.out.print("Wednesday ");
			break;
		case 4:
			System.out.print("Thursday ");
			break;
		case 5:
			System.out.print("Friday ");
			break;
		case 6:
			System.out.print("Saturday ");
			break;
		}
		
		input.close();
	}

}
