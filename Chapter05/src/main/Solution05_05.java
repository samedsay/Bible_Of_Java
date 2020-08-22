package main;

public class Solution05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double POUNDS = 2.2;

		System.out.println("Kilograms\t\tPounds\t|\tPounds\t\tKilograms");
		for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
			System.out.printf("%d \t\t\t%.1f\t|\t%d\t\t%.2f\n", i, (i * POUNDS), j, (j / POUNDS));
		}

	}

}
