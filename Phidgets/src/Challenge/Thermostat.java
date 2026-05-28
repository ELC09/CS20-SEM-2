package Challenge;

import com.phidget22.*;

public class Thermostat {

	    public static void main(String[] args) throws Exception {

	        // Create devices
	        TemperatureSensor tempSense = new TemperatureSensor();

	        DigitalInput greenButton = new DigitalInput();
	        DigitalInput redButton = new DigitalInput();

	        DigitalOutput greenLED = new DigitalOutput();
	        DigitalOutput redLED = new DigitalOutput();

	        // Set hub ports
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);

	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        // Open devices
	        tempSense.open(1000);

	        greenButton.open(1000);
	        redButton.open(1000);

	        greenLED.open(1000);
	        redLED.open(1000);

	        // Starting set temperature
	        int setTemp = 21;

	        System.out.println("Thermostat Started!");
	        System.out.println("Starting Set Temperature: " + setTemp + "°C");

	        while (true) {

	            // Read current temperature
	            double currentTemp = tempSense.getTemperature();

	            // Increase set temperature
	            if (greenButton.getState()) {
	                setTemp++;

	                System.out.println("Set Temperature Increased To: "
	                        + setTemp + "°C");
	                Thread.sleep(200);
	            }

	            // Decrease set temperature
	            if (redButton.getState()) {
	                setTemp--;

	                System.out.println("Set Temperature Decreased To: "
	                        + setTemp + "°C");

	                Thread.sleep(200);
	            }

	            // Check if temperature is within 2 degrees
	            if (currentTemp >= setTemp - 2 &&
	                currentTemp <= setTemp + 2) {

	                greenLED.setState(true);
	                redLED.setState(false);

	            } else {

	                redLED.setState(true);
	                greenLED.setState(false);
	            }

	            // Print temperatures
	            System.out.println("Current Temperature: "
	                    + currentTemp + "°C");

	            System.out.println("Set Temperature: "
	                    + setTemp + "°C");

	            for (int i = 0; i < 100; i++) {

	                if (greenButton.getState()) {
	                    setTemp++;
	                    System.out.println("Set Temperature Increased To: "
	                            + setTemp + "°C");
	                    Thread.sleep(200);
	                }

	                if (redButton.getState()) {
	                    setTemp--;
	                    System.out.println("Set Temperature Decreased To: "
	                            + setTemp + "°C");
	                    Thread.sleep(200);
	                }

	                Thread.sleep(100);
	            // Wait 10 seconds
	           
	        }
	    }
    }
}


