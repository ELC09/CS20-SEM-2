package Skillbuilders;

import java.util.Scanner;

public class GradeAvgP2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Please enter your first grade: ");
		int num1 = input.nextInt();
		sum += num1;
				
		System.out.print("Please enter your second grade: ");
		int num2 = input.nextInt();
		sum += num2;

		System.out.print("Please enter your third grade: ");
		int num3 = input.nextInt();
		sum += num3;
		
		System.out.print("Please enter your fourth grade: ");
		int num4 = input.nextInt();
		sum += num4;
		
		System.out.print("Please enter your fifth grade: ");
		int num5 = input.nextInt();
		sum += num5;
		
//		System.out.println("Total: " + sum);
		
		int average = sum / 5;
		System.out.println("Average: " + average + "%");
		
		input.close();
		
	
		
}
}