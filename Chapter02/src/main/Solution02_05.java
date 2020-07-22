package main;

import java.util.Scanner;

/*
 * (Financial application: calculate tips)
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. 
 */

public class Solution02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		float subtotal = input.nextFloat();
		float gratuity = input.nextFloat();
		gratuity = subtotal * (gratuity / 100.0f);
		float total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		

	}

}
