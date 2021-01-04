package main;

import java.util.Scanner;

public class Solution06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double meter = 20.0;
		double foot = 1.0;
		
		System.out.println("Celcius\t  Fahrenheit\t|\tFahrenheit\tCelcius");
		System.out.println("_________________________________________________________");

		for (int i = 0; i < 10; i++) {

			System.out.printf("  %3.1f\t    %3.3f\t|\t %3.1f\t\t%3.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
			meter += 5;
			foot++;

		}

		input.close();

	}

	public static double footToMeter(double foot) {

		return 0.305 * foot;

	}

	public static double meterToFoot(double meter) {

		return 3.279 * meter;
	}

}
