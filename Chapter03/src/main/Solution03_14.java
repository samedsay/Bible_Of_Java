package main;

import java.util.Scanner;

/*
 * (Game: heads or tails)
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails.
 * The program randomly generates an integer 0 or 1, which represents head or tail.
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 */

public class Solution03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter estimation of 'head'(0) or 'tail'(1) ? ");
		int answer = input.nextInt();
		int headTail = (int)(Math.random() * 2);
		if(headTail == answer)
			System.out.println("You are correct!");
		else
			System.out.println("You are wrong!");
		
		input.close();
	}

}
