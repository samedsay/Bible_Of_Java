package main;

import java.util.Scanner;

public class Solution04_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first city: ");
		String firstCity = input.next();
		System.out.println("Enter the second city: ");
		String secondCity = input.next();
		System.out.println("Enter the third city: ");
		String thirdCity = input.next();
		
		System.out.print("The three cities in alphabetical order are ");

		
		if(firstCity.compareTo(secondCity) <= 0 && firstCity.compareTo(thirdCity) <= 0) {
			if(secondCity.compareTo(thirdCity) <= 0)
				System.out.println(firstCity + " " + secondCity + " " + thirdCity);
			else
				System.out.println(firstCity + " " + thirdCity + " " + secondCity);

				
		}else if(secondCity.compareTo(firstCity) <= 0 && secondCity.compareTo(thirdCity) <= 0) {
			if(firstCity.compareTo(thirdCity) <= 0)
				System.out.println(secondCity + " " + firstCity + " " + thirdCity);
			else
				System.out.println(secondCity + " " + thirdCity + " " + firstCity);		
		}else {
			if(firstCity.compareTo(secondCity) <= 0)
				System.out.println(thirdCity + " " + firstCity + " " +  secondCity);
			else
				System.out.println(thirdCity + " " + secondCity + " " + firstCity);	
		}
		
		input.close();
		
	}

}
