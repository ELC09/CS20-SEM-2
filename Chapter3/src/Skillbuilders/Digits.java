/*

Program: Digits.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Science 20
 

*/


package Skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 2 digit number: ");
		int number = input.nextInt();
		
		int ones = number % 10;
		int tens = number / 10;
		
		System.out.println("Tens place: " + tens);
		System.out.println("Ones place: " + ones);
}
}
/*
Enter a 2 digit number: 
58
Tens place: 5
Ones place: 8

*/