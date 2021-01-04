package main;

import java.util.Scanner;

public class Solution06_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double fahrenheit = 120.0;
		double celcius = 40.0;
		
		System.out.println("Celcius\t  Fahrenheit\t|\tFahrenheit\tCelcius");
		System.out.println("________________________________________________________");

		for (int i = 0; i < 10; i++) {

			System.out.printf("%3.1f\t  %3.1f\t\t|\t%3.1f\t\t%3.2f\n", celcius, celsiusToFahrenheit(celcius), fahrenheit,
					fahrenheitToCelsius(fahrenheit));
			fahrenheit -= 10;
			celcius--;

		}

		input.close();

	}

	public static double celsiusToFahrenheit(double celsius) {

		return (9.0 / 5) * celsius + 32;

	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		return (5.0 / 9) * (fahrenheit - 32);
	}

}
