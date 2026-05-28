package Events;

import com.phidget22.*;

public class ButtonandLEDEvents {

    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    static int totalButtonPresses = 0;
  
    public static void main(String[] args) throws Exception {

     
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
               
            	if(e.getState()) {
            		totalButtonPresses++;
            		System.out.println("Total button presses: " + totalButtonPresses);
            	}
                turnGreenLEDOn = e.getState(); 
            }
        });

        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	
            	if (e.getState()) {
            		totalButtonPresses++;
            		System.out.println("Total button presses: " + totalButtonPresses);
            }
                turnRedLEDOn = e.getState();
            }
        });

        
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        while(true) {
            redLED.setState(turnRedLEDOn);
           
            greenLED.setState(turnGreenLEDOn);
          
            Thread.sleep(150);
        }
    }
}
  

