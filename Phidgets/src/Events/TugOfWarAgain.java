package Events;

import com.phidget22.*;

public class TugOfWarAgain {
  static final int WIN_COUNT = 10;

	    // Score tracking
	    static int redScore = 0;
	    static int greenScore = 0;

	    // Game state
	    static boolean gameOver = false;

	    public static void main(String[] args) throws Exception {

	        // Create
	        DigitalInput redButton = new DigitalInput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	        // Address
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);

	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        // Red button = Player 1
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {

	                if (gameOver) return;

	                // Count only presses
	                if (e.getState()) {
	                    redScore++;
	                    System.out.println("Red: " + redScore);

	                    if (redScore >= WIN_COUNT) {
	                        gameOver = true;
	                        System.out.println("RED PLAYER WINS!");

	                        try {
								redLED.setState(true);
								greenLED.setState(true);
							} catch (PhidgetException e1) {
								
								e1.printStackTrace();
							}
	                        
	                    }
	                }
	            }
	        });

	        // Green button = Player 2
	        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {

	                if (gameOver) return;

	                // Count only presses
	                if (e.getState()) {
	                    greenScore++;
	                    System.out.println("Green: " + greenScore);

	                    if (greenScore >= WIN_COUNT) {
	                        gameOver = true;
	                        System.out.println("GREEN PLAYER WINS!");

	                        try {
								redLED.setState(true);
								greenLED.setState(true);
							} catch (PhidgetException e1) {
								
								e1.printStackTrace();
							}
	                        
	                    }
	                }
	            }
	        });

	        // Open devices
	        redLED.open(1000);
	        greenLED.open(1000);
	        redButton.open(1000);
	        greenButton.open(1000);

	        System.out.println("Tug of War started! First to 10 wins.");

	        // Keep program alive
	        while (!gameOver) {
	            Thread.sleep(100);
	        }
		Thread.sleep(2000);
		
		redLED.setState(false);
		greenLED.setState(false);

		redLED.close();
		greenLED.close();
		redButton.close();
		greenButton.close();


	    }
	}

