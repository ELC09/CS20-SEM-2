/*

Program: DigitExtractionEx1.java          Last Date of this Revision: May 1st, 2026

Purpose: include a Num object that can return the ones digit, ten digit, hundreds digit, and the whole number.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/

package Mastery;  //declares that this class belongs to the "Mastery" package

public class Num {  //defines a class names Num to work with a number
	
	private int number;  //stores the integer value
	
	public Num(int n) {  //constructor that runs when a Num object is created
		number = n;  //assigns the input value to the instance variable
	}
	
	public int getWhole() {  //method that returns the entire number
		return number;  //returns the stored number
	}
	
	public int getOnes() {  //method to get the ones (last) digit
		return number % 10;  //uses modulus to find remainder when divided by 10
	}
	
	public int getTens() {  //method to get the ten digit
		return (number / 10) % 10;  //divides by 10 to remove ones digit, then % 10 to get new last digit
	}
	
	public int getHundreds() {  //method to get the hundreds digit
		return (number / 100) % 10;  //divides by 100 to remove last two digits, then % 10 to get the next digit
	}
	
	public String toString() {  //overrides toString method to define hoe object prints
		return "Whole number " + number;  //returns a string showing the number
	}
}
