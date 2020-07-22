package main;

import java.util.Scanner;

/*
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone.
 */

public class Solution02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();
		long realTime = System.currentTimeMillis();
		int milliseconds = (int)realTime % 1000;
		realTime /= 1000;
		int seconds = (int)realTime % 60;
		realTime /= 60;
		int min = (int)realTime % 60;
		realTime /= 60;
		int hours = (int)realTime % 24; 
		
		System.out.println("The current time is " + (hours + timeZone) + ":" + min + ":" + seconds);

	}

}
