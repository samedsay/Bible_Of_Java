package main;

import java.util.Scanner;

/*
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines 
 * whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */

public class Solution03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
	
		System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0 ? true : false));
		System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0 ? true : false)  );
		System.out.println("Is " + number + " divisible by 5 and 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0) );


		input.close();
	}

}
