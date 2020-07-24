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
			System.out.println("The computer is scissor. You are rock. You won!");
		else if(computer == 0 && user == 2)
			System.out.println("The computer is scissor. You are paper. You lost!");
		else if(computer == 1 && user == 0)
			System.out.println("The computer is rock. You are scissor. You lost!");
		else if(computer == 1 && user == 2)
			System.out.println("The computer is rock. You are paper. You won!");
		else if(computer == 2 && user == 0)
			System.out.println("The computer is paper. You are scissor. You won!");
		else if(computer == 2 && user == 1)
			System.out.println("The computer is paper. You are rock. You lost!");
		else if(computer == 0 && user == 0)
			System.out.println("The computer is scissor. You are scissor too. It is a draw!");
		else if(computer == 1 && user == 1)
			System.out.println("The computer is rock. You are rock too. It is a draw!");
		else if(computer == 2 && user == 2)
			System.out.println("The computer is paper. You are paper too. It is a draw!");
		
		
		input.close();
	}

}
