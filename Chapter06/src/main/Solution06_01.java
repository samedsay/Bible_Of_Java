package main;

import java.util.Scanner;

public class Solution06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter day(1:Monday,...,7:Sunday): ");
		int day = input.nextInt();
		boolean leapYear = false;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
		}

		int totalDay = 0;
		String monthNane = "";
		String dayName = "";

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				monthNane = "January";
				totalDay += 31;
				break;
			case 3:
				monthNane = "March";
				totalDay += 31;
				break;
			case 5:
				monthNane = "May";
				totalDay += 31;
				break;
			case 7:
				monthNane = "July";
				totalDay += 31;
				break;
			case 8:
				monthNane = "August";
				totalDay += 31;
			case 10:
				monthNane = "October";
				totalDay += 31;
				break;
			case 12:
				monthNane = "December";
				totalDay += 31;
				break;
			case 2:
				monthNane = "February";
				totalDay += leapYear ? 29 : 28;
				break;
			case 4:
				monthNane = "April";
				totalDay += 30;
				break;
			case 6:
				monthNane = "June";
				totalDay += 30;
				break;
			case 9:
				monthNane = "September";
				totalDay += 30;
				break;
			case 11:
				monthNane = "November";
				totalDay += 30;
				break;

			}
			
			int lastDay = totalDay % 7 + (day);

			switch (lastDay) {
			case 0:
				dayName = "Sunday";
				break;
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;

			}
			
			System.out.println(monthNane + " 1, " + year + " is " + dayName);
			
		}

	}

}
