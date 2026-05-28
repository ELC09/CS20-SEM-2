package SimplePhidgets;

import com.phidget22.*;

public class tugOfWar {


	public static void main(String[] args) throws Exception {
		
		DigitalOutput redLED =new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();
		

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
		int redScore = 0;
		int greenScore = 0;
		
		System.out.println("Tug of war started!! ");
		System.out.println("First player to press 10 times wins!!");
	
		while(redScore < 10 && greenScore < 10) {
			
			if (redButton.getState()) {
				redScore ++;
				System.out.println("Red Score: " + redScore);
				
				Thread.sleep(200);
				
			}
			if (greenButton.getState()) {
				greenScore ++;
				System.out.println("Green Score: " + greenScore);
				
				Thread.sleep(200);
				
			}
		}

			if (redScore >= 10) {
				System.out.println("RED WINS!!");
				
				redLED.setState(true);
				greenLED.setState(true);
				Thread.sleep(500);
				
				redLED.setState(false);
				greenLED.setState(false);
				Thread.sleep(700);
				
					
				for(int i = 0; i < 5; i++){
		            redLED.setState(true);
		            Thread.sleep(500);
		            redLED.setState(false);
		            Thread.sleep(500);

				}
			redLED.setState(false);
		
			}
			if (greenScore >= 10) {
				System.out.println("GREEN WINS!!");
				
				greenLED.setState(true);
				redLED.setState(true);
				Thread.sleep(500);
				
				greenLED.setState(false);
				redLED.setState(false);
				Thread.sleep(700);
				
					
				for(int i = 0; i < 5; i++){
		            greenLED.setState(true);
		            Thread.sleep(500);
		            greenLED.setState(false);
		            Thread.sleep(500);

				}
			greenLED.setState(false);
		
	}
	}
}
	

