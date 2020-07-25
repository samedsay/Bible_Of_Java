package main;

import java.util.Scanner;

/*
 * (Geometry: two circles)
 * Write a program that prompts the user to enter the center coordinates and radii of two circles and determines
 * whether the second circle is inside the first or overlaps with the first, as shown in Figure 3.10.
 * (Hint: circle2 is inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2 overlaps circle1
 * if the distance between the two centers <= r1 + r2.
 * Test your program to cover all cases.)
 */

public class Solution03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double firstX = input.nextDouble();
		double firstY = input.nextDouble();
		double firstRadius = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double secondX = input.nextDouble();
		double secondY = input.nextDouble();
		double secondRadius = input.nextDouble();
		
		double distance = Math.pow(Math.pow(secondX - firstX, 2) + Math.pow(secondY - firstY, 2), 0.5);
		
		if(distance + secondRadius <= firstRadius)
			System.out.println("circle2 is inside circle1");
		else if(distance - secondRadius > firstRadius)
			System.out.println("circle2 does not overlap circle1");
		else 
			System.out.println("circle2 overlaps circle1");
		
		input.close();
	
	}

}
