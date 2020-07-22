package main;

import java.util.Scanner;

/*
 * (Population projection)
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 * The population should be cast into an integer. 
 */

public class Solution02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int year = input.nextInt();
		System.out.println("The population in " + year + " years is " + ((int)(year * (((365 * 24 * 60 * 60) / 7.0) + ((365 * 24 * 60 * 60) / 45.0)
				- ((365 * 24 * 60 * 60) / 13.0)) + 312_032_486)));
		
		input.close();
		
	}

}
