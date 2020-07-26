package main;

import java.util.Scanner;

/*
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 */

public class Solution03_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();
		long realTime = System.currentTimeMillis();
		realTime /= 1000;
		int seconds = (int)realTime % 60;
		realTime /= 60;
		int min = (int)realTime % 60;
		realTime /= 60;
		int hours = (int)realTime % 24; 
		
		int newHour = hours+timeZone;
		boolean isItAm = true;
		if(newHour == 24)
			newHour = 12;
		else if(newHour > 24) {
			newHour %= 12;
		}
		else if(newHour > 12) {
			newHour %= 12;
			isItAm = false;
		}else if(newHour == 12)
			isItAm = false;

		System.out.println("The current time is " + (newHour) + ":" + min + ":" + seconds + (isItAm ? " AM":" PM"));
		
		input.close();

	}

}
