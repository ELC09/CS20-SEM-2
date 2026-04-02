package Skillbuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int limit = scanner.nextInt();
		
		scanner.close();
		
		int sum = 0;
		
		for (int i = 1; i <= limit; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
	
		System.out.println("The sum of odd numbers from 1 to " + limit + "is:" + sum);
		
	}
}
