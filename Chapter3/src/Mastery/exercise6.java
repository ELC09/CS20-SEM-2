/*

Program: DigitsEx6.java          Last Date of this Revision: March 3, 2026

Purpose: modify the digit application to show the hundreds place digit of a three digit number.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20
 

*/

package Mastery; //This line tells Java the file belongs to the "Mastery" package

import java.util.Scanner; //Imports the Scanner class so we can get input from the user

public class exercise6 //Declares a public class named exercise^
{
		// the main method is where the program starts running
		public static void main(String[] args) { 
			
			//create a Scanner object to read input from the keyboard
			Scanner input = new Scanner(System.in);
			
			// Ask the user to enter a 3 digit number
			System.out.print("Enter a 3 digit number: ");
			
			//Store number entered by the user into the variable "number"
			int number = input.nextInt();
			
			// Use the modulus operator (%) to get the ones
			// The modulus operator gives the remainder after division
			int ones = number % 10;
			
			//Divide the number by 10 first to remove the ones digit
			//Then use % 10 again to get the tens digit
			int tens = (number / 10) % 10;
			
			//Divide the number by 100 to remove the tens and ones digits
			//This leaves only the hundreds digit
			int hundreds = number / 100;
			
			//Display the hundreds digit to the user
			System.out.println("The hundreds place: " + hundreds);
			//Display the tens digit to the user
			System.out.println("The tens place: " + tens);
			//Display the ones digit to the user
			System.out.println("The ones place: " + ones);
	
			//close Scanner
		input.close();
		}
}

/*
Enter a 3 digit number: 567
The hundreds place: 5
The tens place: 6
The ones place: 7
*/