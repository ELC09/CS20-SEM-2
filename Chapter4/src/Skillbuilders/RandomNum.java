package Skillbuilders;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your minimum value: ");
		int lowNum = scanner.nextInt();
		
		
		System.out.println("Please enter your maximum value: ");
		int highNum = scanner.nextInt();
		
		System.out.println("Minimum value is:" + lowNum);
		System.out.println("Maximum value is:" + highNum);
		
		int randomNum = ThreadLocalRandom.current().nextInt(lowNum, highNum + 1);
		
		System.out.println("A random number between " + lowNum + " and " + highNum + " is: " + randomNum);
		
		scanner.close();
	}

	
}
