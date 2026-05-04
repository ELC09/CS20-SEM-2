/*

Program: MySavingsEx1.java          Last Date of this Revision: April 30, 2026

Purpose: Create a MySavings application that displays a menu of choices for entering pennies,
 			nickels, dimes, and quarters into a piggy bank, and then prompts the user to 
 			make a selection. 

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/

package Mastery;  //declares that this class belongs to the "mastery class" 

import java.util.Scanner;  //imports the Scanner class to allow user input

public class MySavingsTest {  //defines a public class named MysavingsTest

	public static void main(String[] args) {  //main method where the program starts running
		
		PiggyBank bank = new PiggyBank();  //creates a PiggyBank object to store money
		
		Scanner input = new Scanner(System.in);  //creates a Scanner object to read user input
		
		int choice;  //declares an integer variable to store the user's menu choice
		
		do  {  //starts a do-while loop so the menu runs at least once
			
			System.out.println("\n-- Piggy Bank Menu --");  //prints the menu title with a new line
			System.out.println("1. Show total in bank");  //displays option 1
			System.out.println("2. Add a penny");  //displays option 2
			System.out.println("3. Add a nickel");  //displays option 3
			System.out.println("4. Add a dime");  //displays option 4
			System.out.println("5. Add a quarter");  //displays option 5
			System.out.println("6. Take money out of bank");  //displays option 6
			System.out.println("0. Quit");  //displays option to quit the program 
			System.out.println("Enter your choice; ");  //prompts the user for input
			
			choice = input.nextInt();  //reads the user's choice from the keyboard
			
			if (choice == 1) {  //checks if the user chose option 1
				System.out.println(bank);  //prints the total money in the piggy bank
			}
			
			else if (choice == 2) {  //checks if the user chose option 2
				bank.addPenny();  //calls method to add one penny to the bank
				System.out.println("Added a penny.");  //prints the action to the user
			}
			
			else if (choice == 3) {  //checks if the user chose option 3
				bank.addNickel();  //calls method to add a nickel to the bank
				System.out.println("Added a nickel.");  //prints the action to the user
			}
			
			else if (choice == 4) {  //checks if the user chose option 4
				bank.addDime();  //calls method to add a dime to the bank
				System.out.println("Added a dime.");  //prints the action to the user
			}
			
			else if (choice == 5) {  //checks if the user chose option 5
				bank.addQuarter();  //calls method to add a quarter to the bank
				System.out.println("Added a quarter.");  //prints the action to the user
			}
			
			else if (choice == 6) {  //checks if the user chose option 6
				bank.emptyBank();  //calls method to remove all money from the bank
				System.out.println("Bank emptied.");  //prints action to user
			}
			
			else if (choice == 0) {  //checks if the user chose to quit
				System.out.println("Goodbye!");  //displays exit message
			}
			
			else {  //runs if the user enters an invalid option
				System.out.println("Invalid choice. Try again.");  //displays error message
			}
			
		}  while (choice != 0);  //repeats the loop until the user enters 0
		
		input.close(); //closes the scanner 
	}
}


/*

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
2
Added a penny.

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
3
Added a nickel.

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
4
Added a dime.

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
5
Added a quarter.

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
1
PiggyBank Contents:
Pennies: 1
Nickels: 1
Dimes: 1
Quarters: 1
Total Value: $0.41

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
6
Bank emptied.

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
1
PiggyBank Contents:
Pennies: 0
Nickels: 0
Dimes: 0
Quarters: 0
Total Value: $0.00

-- Piggy Bank Menu --
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice; 
0
Goodbye!

*/


