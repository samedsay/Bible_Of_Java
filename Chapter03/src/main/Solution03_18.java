package main;

import java.util.Scanner;

/*
 * (Cost of shipping)
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * Write a program that prompts the user to enter the weight of the package and display the shipping cost.
 * If the weight is greater than 50, display a message “the package cannot be shipped.”
 */

public class Solution03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight : ");
		double weight = input.nextDouble();
		double price = 0;
		
		if(weight <= 1)
			price = weight * 3.5;
		else if(weight <= 3)
			price = weight * 5.5;
		else if(weight <= 10)
			price = weight * 8.5;
		else if(weight <= 20)
			price = weight * 10.5;
		else if(weight > 50)
			System.out.println("The package cannot be shipped.");
		
		System.out.println("Total Cost is $" + price);
		
		input.close();

	}

}
