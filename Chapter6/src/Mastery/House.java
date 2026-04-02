/*

Program: House Ex1.java          Last Date of this Revision: April 1, 2026

Purpose: Create a house application that calls methods addRoof(), addBase(), and addWalk() to display a house image.

Author: Your Name, Elliana Cush
School: CHHS
Course: Computer Science 20

*/
package Mastery; //defines the package 

public class House { //defines the class
	public static void main(String[] args) { //main method
		addRoof();   //call method to print roof
		addBase();   //call method to print the base (walls/windows)
		addWalk();   //call method to print the walkway
	}
//prints the roof section
	public static void addRoof() {
		System.out.println("    /\\   ");
		System.out.println("   /  \\   ");
		System.out.println("  /    \\  ");
		System.out.println(" /______\\ ");
	}
//prints the base section (walls/windows)	
	public static void addBase() {
		System.out.println(" |  []  | ");
		System.out.println(" |      | ");
		System.out.println(" |  []  | ");
		System.out.println(" |______| ");
	}
//Prints the bottom section (walkway)	
	public static void addWalk() {
		System.out.println("    **   ");
		System.out.println("     ***  ");
		System.out.println("      **** ");
		System.out.println("       **********");
		
	}
}

/*  
     /\   
    /  \   
   /    \  
  /______\ 
  |  []  | 
  |      | 
  |  []  | 
  |______| 
     **   
      ***  
       **** 
        **********
*/