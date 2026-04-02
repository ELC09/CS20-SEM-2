package Demo;

import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args) 
	{
		DecimalFormat dc = new DecimalFormat("0.00");
		//create a circle object using default constructor//
		Circle c1 = new Circle();
		System.out.println(c1.getRadius());
		c1.setRadius(12.9);
		System.out.println(c1.getRadius());
		System.out.println(dc.format(c1.calculateArea()));
		
	//	c1.radius = 5.7; //cannot access private, error will show up!!
	}

}
