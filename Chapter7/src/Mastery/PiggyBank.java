/*

Program: MySavingsEx1.java          Last Date of this Revision: April 30, 2026

Purpose: Create a PiggyBank object that can add coins to the piggy bank, remove coins,
 			and return the total amount in the bank.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/

package Mastery;  //declares that this class belongs to the 'mastery" package

public class PiggyBank {  //defines a class names PiggyBank to store coin data
	
	private int pennies;  //stores the number of pennies in the bank
	private int nickels;  //stores the number of nickels in the bank
	private int dimes;  //stores the number of dimes in the bank
	private int quarters;  //stores the number of quarters in the bank
	
	public PiggyBank() {  //constructor method that runs when a PiggyBank object is created
		pennies = 0;  //initializes pennies to 0
		nickels = 0;  //initializes nickels to 0
		dimes = 0;  //initializes dimes to 0
		quarters = 0;  //initializes quarters to 0
	}

	public void addPenny() {  //method to add one penny to the bank
		pennies++;  //increases the number of pennies by 1
	}
	
	public void addNickel() {  //method to add one nickel to the bank
		nickels++;  //increases the number of nickels by 1
	}
	
	public void addDime() {  //method to add one dime to the bank
		dimes++;  //increases the number of dimes by 1
	}
	
	public void addQuarter() {  //method to add one quarter to the bank
		quarters++;  //increases the number of quarters by 1
	}
	
	public double getTotal() {  //method that calculates and returns the total value of the bank
		return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);  //calculates total money value
	}
	
	
	public void emptyBank() {  //method to remove all coins from the bank
		pennies = 0;  //resets pennies to 0
		nickels = 0;  //resets nickels to 0
		dimes = 0;  //resets dimes to 0 
		quarters = 0;  //resets quarters to 0
	}
	
	public String toString() {  //overrides toString method to display the bank contents
		return "PiggyBank Contents:\n" +  //header line for output
	               "Pennies: " + pennies + "\n" +  //shows number of pennies
	               "Nickels: " + nickels + "\n" +  //shows number of nickels
	               "Dimes: " + dimes + "\n" +  //shows number of dimes
	               "Quarters: " + quarters + "\n" +  //shows number of quarters
	               "Total Value: $" + String.format("%.2f", getTotal());   //formats total to 2 decimal places

	}
	
}
