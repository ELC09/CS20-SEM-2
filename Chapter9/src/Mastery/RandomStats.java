/*

Program: RandomStatsEx3.java          Last Date of this Revision: May 19th, 2026

Purpose: Create a RandomStats application that generates 500 random numbers between 0 and 9,
         and then displays the number of occurrences of each number.  

Author: Elliana Cush
School: CHHS
Course: Computer Science 20 Period 3

*/
package Mastery;  //places this class inside the mastery package

import java.util.Random;  //imports the random class to generate random numbers

public class RandomStats {  //defines the RandomStats class
	   public static void main(String[] args) {  //main method where program execution begins

	        int[] counts = new int[10];  //creates an array to store occurrences of numbers 0-9
	        Random rand = new Random();  //creates a random object for generating random values
	        
	        
	        for (int i = 0; i < 500; i++) {  //repeats the process 500 times
	            int num = rand.nextInt(10);  //generates a random integer from 0-9
	            counts[num]++;  //increases the count for the generated number
	        }

	       
	        System.out.println("Number\t\tOccurrences");  //displays column headings for the output
	        

	        for (int i = 0; i < counts.length; i++) {  //loops through each index in the array
	            System.out.println(i + "\t\t" + counts[i]);  //prints the number and its total occurrences
	        }
	    }

}
/*
 Number		Occurrences
0		57
1		59
2		43
3		42
4		40
5		58
6		57
7		41
8		58
9		45
 
*/