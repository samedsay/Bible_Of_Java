package main;

import java.util.Scanner;

/*
 * (Sort three integers) Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 */

public class Solution03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 integers for sorting them in non decreasing order : ");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		if(first >= second && first >= third)
			if(second >= third)
				System.out.println(third + " -> " + second + " -> " + first);
			else
				System.out.println(second + " -> " + third + " -> " + first);
		else if(second >= first && second >= third)
			if(first > third)
				System.out.println(third + " -> " + first + " -> " + second);
			else
				System.out.println(first + " -> " + third + " -> " + second);
		else
			if(first >= second)
				System.out.println(second + " -> " + first + " -> " + third);
			else
				System.out.println(first + " -> " + second + " -> " + third);

		
		input.close();

	}

}
