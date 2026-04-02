package Demo;

public class Game {

	public static void main(String[] args) 
	{
		//create instances (objects)// most important thing for chapter 7//
		GameCharacter player1 = new GameCharacter("Hero", 100); //Instance 1 //player1 is an object
		GameCharacter player2 = new GameCharacter("Villian", 85); //Instance 2 //player2 is an object
		
		player1.attack(); //Behavior(something you tell the object to do)-calls a method (from GameCharacter)
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus()); //update
		System.out.println(player2.getStatus()); //update

	}

}
