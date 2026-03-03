package Skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class DemoGuessinggame
{

	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		//Game setup 
		int secretNumber = random.nextInt(30) +1;
		
		//Output
		System.out.println("Guess the number (1-30:");
		System.out.println("your guess:");
		
		
		//single Input
		int guess = input.nextInt();
		}


}
//Things this lesson covered
//Project explorer, making our packages, making the class, setup, including inputs/outputs