/*

Program: ChangeEx5.java          Last Date of this Revision: March 3, 2026

Purpose: Create a change application that prompts the user for an amount less than $1.00 and then displays
the minimum number of coins necessary to make the change.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20
 

*/

package Mastery; //This line tells Java that the file belongs to the "Mastery package.

import java.util.Scanner; //This imports the Scanner class so we can get input from the user.


public class exercise5 { //Declares a public class named exercise^
	//main method 
	public static void main(String[] args) {
		
		//create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);
		
		//User input for amount
		System.out.print("Enter an amount less than $1.00: ");
		//Store number entered by the user into the variable "amount"
		double amount = input.nextDouble();
		
	// Keep asking while the amount is invalid //
		 while (amount >= 1.00 || amount < 0) {
	            System.out.println("Invalid amount. Please enter a value between 0.00 and 0.99.");
	            amount = input.nextDouble();
	        }
		 //print the valid amount 
	        System.out.println("Valid amount entered: " + amount);
		
	    //Convert the dollar amount to cents
		int cents = (int)(amount * 100);
		
		//calculate the max amount of quarters that can be used and the remaining cents
		int quarters = cents / 25;
		cents = cents % 25;
		
		//calculate the max amount of dimes that can be used from the remaining cents
		int dimes = cents / 10;
		cents = cents %10;
		
		//Calculate max number of nickels that can be used from the remaining cents
		int nickels = cents / 5;
		cents = cents % 5;
		
		//The remaining cents after accounting for quarters, dimes, and nickels 
		int pennies = cents;
		
		//Print the minimum number of coins needed for each inputed amount
		  System.out.println("Minimum coins needed:");
	        System.out.println("Quarters: " + quarters);
	        System.out.println("Dimes: " + dimes);
	        System.out.println("Nickels: " + nickels);
	        System.out.println("Pennies: " + pennies);
		
	        //close the scanner 
		input.close();
	}

}
/*
Enter an amount less than $1.00: 0.87
Valid amount entered: 0.87
Minimum coins needed:
Quarters: 3
Dimes: 1
Nickels: 0
Pennies: 2
 */
