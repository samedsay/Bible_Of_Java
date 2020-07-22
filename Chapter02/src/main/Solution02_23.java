package main;

import java.util.Scanner;

/*
 * (Cost of driving)
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 */

public class Solution02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double cost = distance / milesPerGallon * pricePerGallon;
		
		System.out.print("The cost of driving is $" + (float)cost);
		
		input.close();

	}

}
