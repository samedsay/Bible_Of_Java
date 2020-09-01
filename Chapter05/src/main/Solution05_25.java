package main;

public class Solution05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		for (int i = 1; i <= 10000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 10000");

		pi = 0;
		for (int i = 1; i <= 20000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 20000");

		pi = 0;
		for (int i = 1; i <= 100000; i++) {
			pi += (Math.pow(-1, i + 1) / (2.0 * i - 1));
		}
		pi *= 4;
		System.out.println("PI is " + pi + " for i = 100000");

	}

}
