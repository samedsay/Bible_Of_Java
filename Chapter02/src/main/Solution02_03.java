package main;

import java.util.Scanner;

/*
 * (Convert feet into meters)
 * Write a program that reads a number in feet, converts it to meters, and displays the result.
 * One foot is 0.305 meter.
 */

public class Solution02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		float feet = input.nextFloat();
		float meter = feet * 0.305f;
		System.out.println(feet + " feet is " + meter + " meters.");
		
		input.close();
		
	}

}
