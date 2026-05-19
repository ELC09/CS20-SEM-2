/*

Program: EvensAndOddsEx1.java          Last Date of this Revision: May 19th, 2026

Purpose: Create a EvensAndOdds application that generates 25 random integers between 0 and 99,
         and then displays all the evens on one line, and all the odds on the next line. 

Author: Elliana Cush
School: CHHS
Course: Computer Science 20

*/

package Mastery; //declares that this class belongs to the mastery package

import java.util.Random;  //imports the random number generator

public class EvensAndOdds {  //declares the public class named EvensAndOdds

	public static void main(String[] args)  //main method where program starts
	{
	Random random = new Random();  //created a Random object to generate random integers
	
	
	String evenNumbers = " ";  //string used to store all even numbers
	String oddNumbers = " ";  //string used to store all odd numbers
	
	
	for (int i = 0; i < 25; i++) {  //ensures the loop repeats 25 times
		int number = random.nextInt(100);  //generates a random integer between 0 and 99
		
		if (number % 2 == 0) {  //checks if the number is evenly divisible by 2 (=even number)
			evenNumbers += number + " ";  //adds the even number to the evenNumbers string
		}
		else {  //deals with anything that does not fall under the first condition
			oddNumbers += number + " ";  //adds the odd number to the oddNumbers string
		}
	}
		
		
		System.out.println("Odd:  " );  //displays the heading for odd numbers
		System.out.println(oddNumbers);  //outputs all stored odd numbers
		
		System.out.println("Even:  " );  //displays the heading for even numbers
		System.out.println(evenNumbers);  //outputs all stored even numbers
		
	}

}

/*
 
 Odd:  
 89 81 33 73 45 63 25 11 37 99 
Even:  
 8 76 98 80 6 92 6 60 20 12 84 58 14 14 76

*/