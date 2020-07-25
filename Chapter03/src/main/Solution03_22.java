package main;

import java.util.Scanner;

/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a point (x, y) and checks
 * whether the point is within the circle centered at (0, 0) with radius 10.
 * For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 */

public class Solution03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double range = Math.pow((x * x + y * y), 0.5);
		System.out.print("Point (" + x + ", " + y + ") is" + (range < 10 ? "" : " not") +" in the circle");
		
		input.close();
		
	}

}
