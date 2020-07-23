package main;

import java.util.Scanner;

/*
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 * Revise the program to randomly generate an addition question with two integers less than 100.
 */

public class Solution03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int first = (int)(Math.random() * 100);
		int second = (int)(Math.random() * 100);
		
		if(second > first) {
			int temp = first;
			first = second;
			second = temp;
		}
		System.out.print("What is " + first + " + " + second + " ? ");
		int answer = input.nextInt();
		if(first + second == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong!");
			System.out.println(first + " + " + second + " is " + (first + second));
		}
			
		input.close();
	}

}
