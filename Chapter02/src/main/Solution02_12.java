package main;

import java.util.Scanner;

/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, 
 * you can compute the minimum runway length needed for an airplane to take off using the following formula:
 * 			length = (v * v) /  2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2), and displays the minimum run- way length.
 */

public class Solution02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		System.out.print("The minimum runway length for this airplane is " + (float)((speed * speed) / (2 * acceleration)));
		
		input.close();
		

	}

}
