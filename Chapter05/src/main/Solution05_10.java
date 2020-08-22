package main;

import java.util.Scanner;

/*
 * (Find the two highest scores)
 * Write a program that prompts the user to enter the number of students and each student’s name and score,
 * and finally displays the student with the highest score and the student with the second-highest score.
 */

public class Solution05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade;
		int highestGrade = 0;
		int secondHighestGrade = 0;
		String highestGradeStudentName = "";
		String secondHighestGradeStudentName = "";
		do {
			System.out.println("Enter student name: ");
			String name = input.next();
			System.out.println("Enter student grade: ('-1' for quit)");
			grade = input.nextInt();

			if (grade > highestGrade) {
				highestGrade = grade;
				highestGradeStudentName = name;
			}
			if (grade > secondHighestGrade && grade < highestGrade) {
				secondHighestGrade = grade;
				secondHighestGradeStudentName = name;
			}

		} while (grade != -1);

		System.out.println("Highest grade is " + highestGrade + " by " + highestGradeStudentName);
		System.out.println("Second highest grade is " + secondHighestGrade + " by " + secondHighestGradeStudentName);

		input.close();

	}

}
