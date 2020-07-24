package main;

import java.util.Scanner;

/*
 * (Game: scissor, rock, paper)
 * Write a program that plays the popular scissor-rock- paper game.
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether
 * the user or the computer wins, loses, or draws. 
 */

public class Solution03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3);
		
		if(computer == 0 && user == 1)
			System.out.println("You won!");
		else if(computer == 0 && user == 2)
			System.out.println("You lost!");
		else if(computer == 1 && user == 0)
			System.out.println("You lost!");
		else if(computer == 1 && user == 2)
			System.out.println("You won!");
		else if(computer == 2 && user == 0)
			System.out.println("You won!");
		else if(computer == 2 && user == 1)
			System.out.println("You lost!");
		else
			System.out.println("It is a draw!");
		
		input.close();
	}

}
