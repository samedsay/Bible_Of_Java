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
		
		double a = 100;
		double b = 200;
		double c = (int)(Math.pow(Math.pow(100, 2) + Math.pow(200, 2), 0.5));
		
		double halfPerimeter = (a + b + c) / 2;
		double area = Math.pow(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) *
				(halfPerimeter - c), 0.5);
		
		double newSide1 = Math.pow(Math.pow(x-0, 2) + Math.pow(y-0, 2), 0.5);
		double newSide2 = Math.pow(Math.pow(x-0, 2) + Math.pow(y-100, 2), 0.5);
		halfPerimeter = (newSide1 + newSide2 + a) / 2;
		double areaA = Math.pow(halfPerimeter * (halfPerimeter - newSide1) * (halfPerimeter - a) *
				(halfPerimeter - newSide2), 0.5);
		
		newSide1 = Math.pow(Math.pow(x-0, 2) + Math.pow(y-0, 2), 0.5);
		newSide2 = Math.pow(Math.pow(x-200, 2) + Math.pow(y-0, 2), 0.5);
		halfPerimeter = (newSide1 + newSide2 + b) / 2;
		double areaB = Math.pow(halfPerimeter * (halfPerimeter - newSide1) * (halfPerimeter - b) *
				(halfPerimeter - newSide2), 0.5);
		
		newSide1 = Math.pow(Math.pow(x-0, 2) + Math.pow(y-100, 2), 0.5);
		newSide2 = Math.pow(Math.pow(x-200, 2) + Math.pow(y-0, 2), 0.5);
		halfPerimeter = (newSide1 + newSide2 + c) / 2;
		double areaC = Math.pow(halfPerimeter * (halfPerimeter - newSide1) * (halfPerimeter - c) *
				(halfPerimeter - newSide2), 0.5);
		
		//if(area == areaA + areaB + areaC)
			System.out.println("The point is in the triangle" + area);
		
			System.out.println("The point is not in the triangle" + (areaA + areaB + areaC));

		

	}

}
