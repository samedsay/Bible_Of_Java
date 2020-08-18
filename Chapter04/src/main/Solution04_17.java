package main;

import java.util.Scanner;

public class Solution04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month: ");
		String month = input.next();
		int days = 0;

		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && (month.equals("Feb"))) {
			days = 29;
			System.out.println(month + " " + year + " has " + days + " days.");

		} else {
			switch(month) {
			case "Feb":
				days = 28;
				System.out.println(month + " " + year + " has " + days + " days.");
				break;
			case "Jan":
			case "Mar":
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
				days = 31;
				System.out.println(month + " " + year + " has " + days + " days.");
				break;
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				days = 30;
				System.out.println(month + " " + year + " has " + days + " days.");
				break;
			}
		}

		input.close();

	}

}
