package com.derekwilliams.handson2;

public class HandsOn {

	public static void main(String[] args) {
		int age = -13;
		boolean isStudent = true;
		
		// if age is invalid, return invalid message
		if(age <= -1) {
			System.out.println("Invalid age entered");
		}
		
		// if senior citizen, pay $7
		else if(age >= 65) { 
			System.out.println("Your cost is $7.00USD");
		}
		
		// if student, pay $8
		// if child, pay $8
		else if(age <= 12 || isStudent == true) {
			System.out.println("Your cost is $8.00USD");
		}
		
		// everyone else, pay $10
		else {
			System.out.println("Your cost is $10.00USD");
		}
		
		
	}

}
