package Demo;

public class GameCharacter //class is always a template, defines what objects you have // public is like setting social media profile to public or private//
{
	//Instance variables
	private String name;
	private int health;

	
	//constructor method // overload - when you add to the existing method henceforth overloading the method//
	//public means method can be called from anywhere
	public GameCharacter(String charName, int starHealth)
	{
		name = charName; 
		health = starHealth;
	}
	
	//Behavior: actions the character can do
	public void attack()      
	{
		System.out.println(name + " attacks! Deals 10 damages." );
	}
	
	
	//update damages
	public void takeDamage(int damage)
	{
		health = health - damage;
		
		if(health < 0)
			health = 0;
		System.out.println(name + "'s health is now " + health);
	}
	
	//give back the updated health
	public String getStatus()
	{
		return name + " has " + health + " health.";
	}
	

	
}

