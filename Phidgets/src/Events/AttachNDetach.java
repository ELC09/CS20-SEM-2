package Events;

import com.phidget22.*;

public class AttachNDetach {

	    public static void main(String[] args) throws Exception {

	        // Create devices
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        DigitalOutput led = new DigitalOutput();
	        DigitalInput button = new DigitalInput();
	        
	        led.setHubPort(1);
	        led.setIsHubPortDevice(true);
	        
	        button.setHubPort(0); 
	        button.setIsHubPortDevice(true);
	     

	      
	        // temperature sensor event
	        temperatureSensor.addTemperatureChangeListener(e -> {
	            System.out.println("Temperature: " + e.getTemperature() + "°C");
	        });

	        temperatureSensor.addAttachListener(e -> {
	            System.out.println("Attach TemperatureSensor");
	        });

	        temperatureSensor.addDetachListener(e -> {
	            System.out.println("Detach TemperatureSensor");
	        });

	       
	        // LED events
	        led.addAttachListener(e -> {
	            System.out.println("Attach LED");
	        });

	        led.addDetachListener(e -> {
	            System.out.println("Detach LED");
	        });

	      
	        // button events
	        button.addAttachListener(e -> {
	            System.out.println("Attach Button");
	        });

	        button.addDetachListener(e -> {
	            System.out.println("Detach Button");
	        });


	        // open connections
	        temperatureSensor.open(1000);
	        led.open(1000);
	        button.open(1000);

	        // Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	}

// if you disconnect your USb cable the code will stop running and spit out a detach statement. It will only continue when USB is reconnected
