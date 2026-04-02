/*

Program: AddCoins Ex5.java          Last Date of this Revision: April 1, 2026

Purpose: Create an application that prompts the user for the number of pennies, nickels, dimes, and quarters, and
 		then displays their total dollar amount. 

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/
package Mastery; //Defines package

import java.util.Scanner; //imports scanner class for user input

public class AddCoins { //Defines the AddCoins class
	public static void main(String[] args) { //Main method
		
		
		Scanner scanner = new Scanner(System.in); //create Scanner object to read input 
		
		System.out.println("Please enter your total coins!"); //Descriptive line
		
		System.out.print("Enter number of pennies: "); //Prompts user for number of pennies
		int pennies = scanner.nextInt(); //Stores user input for pennies in "pennies"
		
		System.out.print("Enter number of nickels: "); //Prompts user for number of nickels
		int nickels = scanner.nextInt(); //Stores user input for pennies in "nickels"
		
		System.out.print("Enter number of dimes: "); //Prompts user for number of dimes
		int dimes = scanner.nextInt();  //Stores user input for pennies in "dimes"
		
		System.out.print("Enter number of quarters: "); //Prompts user for number of quarters
		int quarters = scanner.nextInt();   //Stores user input for pennies in "quarters"
		
		System.out.println();  //Prints a blank line
		
		System.out.println("Quarters: " + quarters); //Prints number of quarters entered 
		System.out.println("Dimes: " + dimes); //Prints number of dimes entered 
		System.out.println("Nickels: " + nickels);  //Prints number of nickels entered 
		System.out.println("Pennies: " + pennies);  //Prints number of pennies entered 
		
		System.out.println(); //Prints a blank line
		
		//Calls the method to calculate total dollar amount
		String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
		//Displays the formatted total dollar amount
        System.out.println("Total dollar amount: " + totalAmount);
     
        scanner.close(); //Close the Scanner
	}

	//Method that calculates total value of coins and returns it as a formatter String
	public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) { 
        
		//convert all coins into total cents
		int totalCents = pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25; 
        
		// convert cents into dollar (divide by 100 to get decimal value)
        double dollars = totalCents / 100.0;
        
        //Format the result as a string with a dollar sign and two decimal places
        return String.format("$%.2f", dollars);
	}

}

/* 
Please enter your total coins!
Enter number of pennies: 2
Enter number of nickels: 3
Enter number of dimes: 4
Enter number of quarters: 5

Quarters: 5
Dimes: 4
Nickels: 3
Pennies: 2

Total dollar amount: $1.82

 */
