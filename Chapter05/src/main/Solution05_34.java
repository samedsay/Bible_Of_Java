package main;

import java.util.Scanner;

public class Solution05_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int diff = 0;
		int userScore = 0;
		int computerScore = 0;

		while (diff < 2) {

			System.out.print("scissor (0), rock (1), paper (2): ");
			int user = input.nextInt();
			int computer = (int) (Math.random() * 3);

			if (computer == 0 && user == 1) {
				System.out.println("The computer is scissor. You are rock. You won!");
				userScore++;
			} else if (computer == 0 && user == 2) {
				System.out.println("The computer is scissor. You are paper. You lost!");
				computerScore++;
			} else if (computer == 1 && user == 0) {
				System.out.println("The computer is rock. You are scissor. You lost!");
				computerScore++;
			} else if (computer == 1 && user == 2) {
				System.out.println("The computer is rock. You are paper. You won!");
				userScore++;
			} else if (computer == 2 && user == 0) {
				System.out.println("The computer is paper. You are scissor. You won!");
				userScore++;
			} else if (computer == 2 && user == 1) {
				System.out.println("The computer is paper. You are rock. You lost!");
				computerScore++;
			} else if (computer == 0 && user == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw!");
			} else if (computer == 1 && user == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw!");
			} else if (computer == 2 && user == 2) {
				System.out.println("The computer is paper. You are paper too. It is a draw!");
			}
			
			diff = userScore > computerScore ? userScore - computerScore : computerScore - userScore;
		}

		input.close();

	}

}
