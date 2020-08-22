package main;

public class Solution05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double POUNDS = 2.2;

		System.out.println("Kilograms\t\tPounds");
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%d \t\t\t%.1f\n", i, (i * POUNDS));
		}

	}

}
