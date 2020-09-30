package main;

import java.util.Scanner;

public class Solution05_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal number to see in binary format: ");
		int decimalNumber = input.nextInt();
		int power = 0;
		int binaryNumber = 0;
		System.out.print(decimalNumber);
	
		while (decimalNumber > 0) {

			int remainder = decimalNumber % 8;
			decimalNumber /= 8;
			binaryNumber += remainder * Math.pow(10, power++);
		}
		
		System.out.println(" (Decimal) = " + binaryNumber  + " (Octal)");

		input.close();
	}

}
