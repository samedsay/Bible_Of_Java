package main;

import java.util.Scanner;

/*
 * (Compute the volume of a cylinder) 
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
 * 		area = radius * radius * PI
 * 		volume = area * length
 */

public class Solution02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double radius, length, area, volume;
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		area = radius * radius * Math.PI;
		volume = area * length;
		System.out.println("Area of cylinder is " + area);
		System.out.println("Volume of cylinder is " + volume);
		
		input.close();
		

	}

}
