/*

Program: MySavingsEx1.java          Last Date of this Revision: May 1st, 2026

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, tens, hundreds digit of the number.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/

package Mastery;  //declares that this class belongs to the "Mastery" package

import java.util.Scanner;  //imports the Scanner class to allow user input

public class DigitExtractor {  //defines a public class name DigitExtractor

	public static void main(String[] args) {  //main method where the program starts running
		
		Scanner input = new Scanner(System.in);  //creates a Scanner object to read input from the keyboard
		
		System.out.print("Please enter a 3 digit integer: ");  //prompts the user to enter a number
		int numInput = input.nextInt();  //stores the integer entered by the user
		
		Num num = new Num(numInput);  //creates a Num object using the user's input
		
		char choice;  //declares a variable to store the user's menu choice
		
		do {  //starts a loop that will run at least once and repeat until user chooses Q to quit
			
			System.out.println("\nW - Show whole number");  //displays menu option for whole number
			System.out.println("O - Show ones place number");  //displays menu option for ones digit
			System.out.println("T - Show tens place number");  //displays menu option for tens digit
			System.out.println("H - Show hundreds place number");  //displays menu option for hundreds digit
			System.out.println("Q - Quit");  //displays menu option to quite program 
			System.out.println("Enter your choice: ");  //prompts user to enter a menu choice 
			
            choice = input.next().toUpperCase().charAt(0);  //read user input, converts it to upper case, and take the first character

            if (choice== 'W') {  //checks if user chose 'W'
                System.out.println(num);  //prints the whole number (uses toString method of Num class)
            }
            else if (choice =='O') {  //checks if user chose 'O' 
            	System.out.println("Ones place digit is: " + num.getOnes());  //calls method to get ones digit and display it
            }
            else if (choice == 'T') { //checks if user chose 'T'
            	System.out.println("Tens place digit is: " + num.getTens());  //calls method to get tens digit and display it
            	}
            else if (choice == 'H') {  //checks if user chose 'H'
            	System.out.println("Hundreds place digit is: " + num.getHundreds());  //calls method to get hundreds digit and display it
            }
            else if (choice == 'Q') {  //checks if user chose 'Q'
            	System.out.println("Goodbye!!");  //displays exit message
            }
            
            else {  //runs if the user enters an invalid option
            	System.out.println("Invaid choice, please try again");  //tells user the input was invalid
            }
		} while (choice != 'Q');  //repeats the loop until the user enter 'Q'
		
		input.close();  //closes the scanner
	}
}

 /*
Please enter a 3 digit integer: 123

W - Show whole number
O - Show ones place number
T - Show tens place number
H - Show hundreds place number
Q - Quit
Enter your choice: 
w
Whole number 123

W - Show whole number
O - Show ones place number
T - Show tens place number
H - Show hundreds place number
Q - Quit
Enter your choice: 
o
Ones place digit is: 3

W - Show whole number
O - Show ones place number
T - Show tens place number
H - Show hundreds place number
Q - Quit
Enter your choice: 
t
Tens place digit is: 2

W - Show whole number
O - Show ones place number
T - Show tens place number
H - Show hundreds place number
Q - Quit
Enter your choice: 
h
Hundreds place digit is: 1

W - Show whole number
O - Show ones place number
T - Show tens place number
H - Show hundreds place number
Q - Quit
Enter your choice: 
q
Goodbye!!


*/
