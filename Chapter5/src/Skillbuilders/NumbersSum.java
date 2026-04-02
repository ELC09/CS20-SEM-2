package Skillbuilders;

import java.util.Scanner;

public class NumbersSum {
	
	public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        System.out.print("Enter a number: ");

        // Check if the input is a valid integer
        if (reader.hasNextInt()) {
            int limit = reader.nextInt(); // Read the user's number

            if (limit < 1) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("The numbers from 1 to " + limit + " are:");

                // Loop from 1 up to the limit number
                while (count <= limit) {
                    System.out.println(count); // Print the current number on a new line
                    sum += count; // Add the current number to the sum
                    count++; // Increment the counter
                }

                // Print the final sum after the loop finishes
                System.out.println("The sum of these numbers is: " + sum);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        reader.close(); // Close the scanner to free up resources
    }

}
