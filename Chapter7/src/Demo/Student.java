package Demo;

public class Student
{
	//Instance variables
	private String fullName;
	private double gpa;
	
	//Constructor method
	public Student(String stuName, double startingGPA)
	{
		fullName = stuName;
		gpa = startingGPA;
	}
	
	//Accessor method (start with "get")
	public String getfullName()
	{
		return fullName;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	
	//modifier methods (opposite of accessor)
	public void setfullName(String nm)
	{
		fullName = nm;
	}
	
	public void setGPA(double x)
	{
		gpa = x;
	}
	
	
	
	public void updateGPA(double newGPA)
	{
		if(newGPA >= 0 && newGPA <= 4.0)
		{
			gpa = newGPA;
		}
		else {
			System.out.println("Invalid GPA - must be between 0 - 4.0");
		}
		
	}
	
	public String toString()
	{
		return fullName + "  (GPA: " + gpa + ")";
	}
	
	
	
}

