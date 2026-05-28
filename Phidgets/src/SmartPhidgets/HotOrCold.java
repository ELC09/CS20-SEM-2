package SmartPhidgets;

import com.phidget22.*;

public class HotOrCold {

    public static void main(String[] args) throws Exception {

        TemperatureSensor temperatureSensor = new TemperatureSensor();

        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        
        //Address
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
       
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        temperatureSensor.open(1000);

        redLED.open(1000);
        greenLED.open(1000);

        while (true) {

            double temperature = temperatureSensor.getTemperature();

            System.out.println("Temp: " + temperature + "°C");

            // Check Temp
            if (temperature >= 20 && temperature <= 24) {

                greenLED.setState(true);
                redLED.setState(false);

            } else {

                redLED.setState(true);
                greenLED.setState(false);
            }

            Thread.sleep(500);
        }
    }
}


