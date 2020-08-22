package main;

public class Solution05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double MILES = 1.609;

		System.out.println("Kilometers\t\tMiles");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d \t\t\t%.3f\n", i, (i * MILES));
		}

	}

}
