package Methods;

import com.phidget22.*;

public class ClosingPhidgets {

	    public static void main(String[] args) throws Exception{

	        
	       TemperatureSensor temperatureSensor = new TemperatureSensor();

	       
	       temperatureSensor.open(1000);

	      
	       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	        
	  
	       temperatureSensor.close();
	        
		   temperatureSensor.open(1000);
	       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	    }
	}
	  
// Anything after the close call will not execute properly because your code will not find the channel you're trying to use.

// You have to open it again to continue the program

