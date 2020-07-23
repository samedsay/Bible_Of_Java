package main;

import java.util.Scanner;

/*
 * (Financial application: monetary units)
 * Modify Listing 2.10, ComputeChange .java, to display the nonzero denominations only,
 * using singular words for single units such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
 */

public class Solution03_07 {

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
		System.out.println("		" + numberOfOneDollars + (numberOfOneDollars > 1 ? " dollars" : " dollar"));
		System.out.println("		" + numberOfQuarters + (numberOfQuarters > 1 ? " quarters " : " quarter"));
		System.out.println("		" + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
		System.out.println("		" + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel"));
		System.out.println("		" + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));
		
		input.close();
		
	}

}
