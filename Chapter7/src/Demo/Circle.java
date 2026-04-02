package Demo;

public class Circle 

{
	private double radius;
	
	public Circle()//default constructor method
	{
		radius = 1.0;
	}
	
	
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()//accesor
	{
		return radius;
	}
	
	public void setRadius(double r) //modifier
	{
		if(radius > 0)
			radius = r;
		else
			System.out.println("Error: Radius must be poisitive");
	}
	
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius,  2);
	}
	
	public String toString() //return class variables, its job is to just print the blue (instance) variables
	{
		return "Circle[radius = "+ radius + ", area= " + calculateArea()+"]";
	}
	
}
