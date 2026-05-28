package SimplePhidgets;

import com.phidget22.DigitalOutput;

public class blinkLED 
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 DigitalOutput greenLED = new DigitalOutput();

		 greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);
	        
	        greenLED.open(2000);
	        
	        for(int i = 0; i < 3; i++){
	            greenLED.setState(true);
	            Thread.sleep(1000);
	            greenLED.setState(false);
	            Thread.sleep(1000);
	        }
	        greenLED.setState(false);
	 }
	 
}

