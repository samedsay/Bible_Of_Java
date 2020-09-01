package main;

public class Solution05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		for (int i = 0; i <= 10000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 10000");

		pi = 0;
		for (int i = 0; i <= 20000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 20000");

		pi = 0;
		for (int i = 0; i <= 100000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 100000");

		// Compute PI value for i = 10000,
		double sum = 0;
		double value = 10000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d;
		}
		double pi2 = 4 * sum;

		// Display result
		System.out.println("PI value for i = 10000: " + pi2);

	}

}
