package main;

import java.util.Scanner;

/*
 * (Find the highest score)
 * Write a program that prompts the user to enter the number of students and each student’s name and score,
 * and finally displays the name of the student with the highest score.
 */

public class Solution05_08{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int grade;
		int highestGrade = 0;
		String highestGradeStudentName = "";
		do {
			System.out.println("Enter student name: ");
			String name = input.next();
			System.out.println("Enter student grade: ('-1' for quit)");
			grade = input.nextInt();

			if (grade > highestGrade) {
				highestGrade = grade;
				highestGradeStudentName = name;
			}

		} while (grade != -1);

		System.out.println("Highest grade is " + highestGrade + " by " + highestGradeStudentName);

		input.close();

	}

}
