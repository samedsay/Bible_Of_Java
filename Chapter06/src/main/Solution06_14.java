package main;

import java.util.Scanner;

public class Solution06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter i value: ");
		int iMax = input.nextInt();
		
		double result = 0;
		
		for(int i = 1; i < iMax; i+=100) {
			
			result += 4 * (Math.pow(-1, i + 1) / (2 * i -1));
			
			System.out.printf("%d\t\tm(%4f) \n", i, result);
			
			
		}
		

	}
	
	public static double mFunction(int i) {
		
		
		return 0;
	}

}
