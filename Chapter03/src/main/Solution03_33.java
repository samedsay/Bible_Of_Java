package main;

import java.util.Scanner;

/*
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost.
 * The program prompts the user to enter the weight and price of the each package and displays the one with the better price.
 */

public class Solution03_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double firstWeight = input.nextDouble();
		double firstPrice = input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		double secondWeight = input.nextDouble();
		double secondPrice = input.nextDouble();
		
		double firstRate = firstPrice / firstWeight * 1.0 ;
		double secondRate =  secondPrice / secondWeight * 1.0;
		if(firstRate == secondRate)
			System.out.println("Two packages have the same price.");
		else if(firstRate > secondRate)
			System.out.println("Package 2 has a better price.");
		else
			System.out.println("Package 1 has a better price.");
		
		input.close();

	}

}
