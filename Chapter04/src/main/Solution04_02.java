package main;

import java.util.Scanner;

public class Solution04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double EARTH_RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();

		double distance = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) 
					+ Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) 
					* Math.cos(Math.toRadians(longitude1) - Math.toRadians(longitude2)));
		
		System.out.printf("The distance between the two points is %f km", distance);
		
		input.close();

		
	}

}
