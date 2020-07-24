package main;

import java.util.Scanner;

/*
 * (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
 * Otherwise, display that the input is invalid.
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */

public class Solution03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 edge of triangle : ");
		double first = input.nextDouble();
		double second = input.nextDouble();
		double third = input.nextDouble();
		
		if(first + second > third && first + third > second && second + third > first)
			System.out.println("The perimeter of this triangle is " + (first + second + third));
		else
			System.out.println("The input is invalid!");
		
		input.close();

	}

}
