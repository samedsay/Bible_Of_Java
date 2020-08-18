package main;

/*
 * (Process a string)
 * Write a program that prompts the user to enter a string and displays its length and its first character.
 */

import java.util.Scanner;

public class Solution04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String line = input.next();
		System.out.println("First letter of \"" + line + "\" is " + line.charAt(0));
		
		input.close();

	}

}
