package main;

import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays its area.
 */

public class Solution02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);
		System.out.print("The area is " + area);
	
	}

}
