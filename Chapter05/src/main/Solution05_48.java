package main;

/*
 * (Process string)
 * Write a program that prompts the user to enter a string and displays the characters at odd positions. 
 */

import java.util.Scanner;

public class Solution05_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String line = input.nextLine();
		String output = "";
		
		for(int i = 0; i < line.length(); i++) {
			
			if(i % 2 == 0)
				output += line.charAt(i);
			
		}

		System.out.println(output);
		
		input.close();
	}

}
