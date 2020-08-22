package main;

public class Solution05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double MILES = 1.609;

		System.out.println("Kilometers\t\tMiles\t|\tMiles\t\tKilometers");
		for (int i = 1, j = 20; i <= 10; i++, j += 5) {
			System.out.printf("%d \t\t\t%.3f\t|\t%d\t\t%.3f\n", i, (i * MILES), j, (j / MILES));
		}

	}

}
