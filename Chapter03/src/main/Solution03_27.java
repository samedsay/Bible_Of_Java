package main;

import java.util.Scanner;

/*
 * (Geometry: points in triangle?)
 * Suppose a right triangle is placed in a plane as shown below.
 * The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100).
 * Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle. 
 */

public class Solution03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double x1, y1, x2, y2, x3, y3;
		x1 = y1 = x2 = y3 = 0;
		y2 = 100;
		x3 = 200;
		
		int area = (int)Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 *(y1 - y2)) / 2);
		int areaA = (int)Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 *(y - y2)) / 2);
		int areaB = (int)Math.abs((x1 * (y - y3) + x * (y3 - y1) + x3 *(y1 - y)) / 2);
		int areaC = (int)Math.abs((x1 * (y2 - y) + x2 * (y - y1) + x *(y1 - y2)) / 2);
		
		if(area == (areaA + areaB + areaC))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
		
		input.close();

	}

}
