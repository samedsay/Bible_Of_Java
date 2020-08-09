package main;

import java.util.Scanner;

public class Solution04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double latitude1 = 33.7490;
		double longitude1 = 84.3880;

		double latitude2 = 28.5383;
		double longitude2 = 81.3792;
		
		double latitude3 = 32.0809;
		double longitude3 = 81.0912;

		double latitude4 = 35.2271;
		double longitude4 = 80.8431;
		
		double side1 = Math.pow(Math.pow(latitude2 - latitude1, 2) + Math.pow(longitude2 - longitude1, 2), 0.5);
		double side2 = Math.pow(Math.pow(latitude3 - latitude1, 2) + Math.pow(longitude3 - longitude1, 2), 0.5);
		double side3 = Math.pow(Math.pow(latitude3 - latitude2, 2) + Math.pow(longitude3 - longitude2, 2), 0.5);
		double side = (side1 + side2 + side3) / 2;
		double area1 = Math.pow(side * (side - side1) * (side - side2) * (side - side3) , 0.5);
		
		side1 = Math.pow(Math.pow(latitude2 - latitude1, 2) + Math.pow(longitude2 - longitude1, 2), 0.5);
		side2 = Math.pow(Math.pow(latitude4 - latitude1, 2) + Math.pow(longitude4 - longitude1, 2), 0.5);
		side3 = Math.pow(Math.pow(latitude4 - latitude2, 2) + Math.pow(longitude4 - longitude2, 2), 0.5);
		side = (side1 + side2 + side3) / 2;
		double area2 = Math.pow(side * (side - side1) * (side - side2) * (side - side3) , 0.5);
		
		double area = area1 + area2;

		System.out.printf("The total area of this region is " +  area);
		
		input.close();


	}

}
