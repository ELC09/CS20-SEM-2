package SimplePhidgets;
import com.phidget22.*;

public class buttonsAndLEDS {

	public static void main(String[] args) throws Exception{

      DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

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

        int totalButtonPresses = 0;
        
        boolean lastRedState = false;
        boolean lastGreenState = false;
        
        while(true){
        	
        	boolean redState = redButton.getState();
        	boolean greenState = greenButton.getState(); 
        	
            if( greenState){
                redLED.setState(false);
            } else {
                redLED.setState(true);
            }

            if(redState){
                greenLED.setState(false);
            } else {
                greenLED.setState(true);
            }
            
            if (redState && !lastRedState) {
            	totalButtonPresses++;
            	System.out.println ("Red Button Pressed");
            	System.out.println("Total button presses: " +totalButtonPresses);
            	
            }

            if (greenState && !lastGreenState) {
            	totalButtonPresses++;
            	System.out.println("Green Button Pressed");
            	System.out.println("Total button presses: " + totalButtonPresses);	
            }
            lastRedState = redState;
            lastGreenState = greenState;
            
            Thread.sleep(150);
          
        }
        
    }
   
}
  
