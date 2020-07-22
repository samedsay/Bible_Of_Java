package main;

import java.util.Scanner;

/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange .java, to fix the possible loss of accuracy when converting a double value to an int value.
 * Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 */

public class Solution02_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in int, for example 1156 (11 dollar 56 cent): ");
		int amount = input.nextInt();
		
		int numberOfOneDollars = amount / 100;
		amount = amount % 100;
		
		int numberOfQuarters = amount / 25;
		amount = amount % 25;
		
		int numberOfDimes = amount / 10;
		amount = amount % 10;
		
		int numberOfNickels = amount / 5;
		amount = amount % 5;
		
		int numberOfPennies = amount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("		" + numberOfOneDollars + " dollars");
		System.out.println("		" + numberOfQuarters + " quarters ");
		System.out.println("		" + numberOfDimes + " dimes");
		System.out.println("		" + numberOfNickels + " nickels");
		System.out.println("		" + numberOfPennies + " pennies");
		
		input.close();
		
	}

}
