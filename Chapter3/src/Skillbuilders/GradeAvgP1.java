package Skillbuilders;

import java.util.Scanner;

public class GradeAvgP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your first grade: ");
		int num1 = input.nextInt();
		
		System.out.print("Please enter your second grade: ");
		int num2 = input.nextInt();

		System.out.print("Please enter your third grade: ");
		int num3 = input.nextInt();
		
		System.out.print("Please enter your fourth grade: ");
		int num4 = input.nextInt();
		
		System.out.print("Please enter your fifth grade: ");
		int num5 = input.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		int average = sum / 5;
		System.out.println("Your grade average is: " + average);
		
}
}