package main;

import java.util.Scanner;

public class Solution04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		double numberOfSides = input.nextDouble();
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/numberOfSides));
		System.out.printf("The area of the polygon is : %.2f",area);

		
		input.close();

	}

}
