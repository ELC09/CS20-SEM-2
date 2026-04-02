/*

Program: DigitsSum Ex6.java          Last Date of this Revision: March 31, 2026

Purpose: Create an application that prompts the user for a non-negative integer and then displays the sum of the digits. 

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/
package Mastery; //defines the package

import java.util.Scanner;

public class DigitsSum { //defines the class names DigitSum
	public static void main(String[] args) { //main method 
		
		//create a scanner object to read input
		Scanner scanner = new Scanner(System.in);
		//variable to store the number entered by the user
		int number;
		
		//ask user to enter a number 
		System.out.print("Enter a non-negative integer: "); //display prompt
		//read the number from the user and store it
		number = scanner.nextInt();
		
		//variable to keep track of the sum of digits
		int sum = 0;
		
		//loop runs while the number is greater than 0
		while (number > 0) { //check if there are still digits remaining
			sum += number % 10;  //get the last digit and add it to sum
			number = number / 10;  //remove the last digit from the number
		}
		//display the final result
		System.out.println("The sum of the digits is: " + sum);
		
		//closes the scanner
		scanner.close();
	}
}
/*
Enter a non-negative integer: 268
the sum of the digits is: 16
*/