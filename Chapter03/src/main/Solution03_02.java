package main;

import java.util.Scanner;

/*
 * (Game: add three numbers) 
 * The program in Listing 3.1, AdditionQuiz.java, gen- erates two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to enter the sum of these three integers.
 */

public class Solution03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		int number3 = (int)(System.currentTimeMillis() / 100 % 10);
		int totalReal = number1 + number2 + number3;
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		int totalUser = input.nextInt();
		
		System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + totalUser + " is " + 
						(totalReal == totalUser ? true : false));



	}

}
