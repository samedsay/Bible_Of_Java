package main;

public class Solution05_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = 0;
		
		for(int i = 1; i < 625; i++) {
			
			result += (1 * 1.0) / (Math.sqrt(i) + Math.sqrt(i+1));
			
		}
		
		System.out.println("The result is " + result);

	}

}
