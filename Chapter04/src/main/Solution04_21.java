package main;

import java.util.Scanner;

/*
 * (Check SSN)
 * Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit.
 * Your program should check whether the input is valid.
 */

public class Solution04_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN: ");
		String number = input.next();
		System.out.println(number);
		if(number.charAt(3) != '-' || number.charAt(6) != '-' || number.length() != 11) {
			System.out.println(number + " is an invalid social security number");
		}else {
			System.out.println(number + " is a valid social security number");

		}
		
	}

}
