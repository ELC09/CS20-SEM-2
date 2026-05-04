package Demos;

public class friendsList {

	public static void main(String[] args) 
	{	//First option how to start an array when you need to take in data
		//declare and then allocate space inside the system
		//String[] friends = new String[5];;    //declare = allocate//
	   
		//Initialize with values
		//Other option for above lines (for when you know your values)//
		//String[] friends = {"Kermit", "Vlad", "Ahmed", "Lisa", "Gurshaan"};
		
		
		//Other example with integers//
		//declaration      //initialization
		int[] squares = new int[11];
		
		//to fill the array
		for(int i = 0; i < squares.length; i++)
		{
			squares[i] = i * i;   //stores the square of the index//
		}
		
		//to display values from the array (unique to arrays) 
		for(int val: squares)
		{
			System.out.println(val);
		}
		
		
		
		
		
		
	}

}
