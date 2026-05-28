package Events;

import com.phidget22.*;

public class DataInterval {

	    public static void main(String[] args) throws Exception {

	         TemperatureSensor temperatureSensor = new TemperatureSensor();

	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                System.out.println("Temperature: " + e.getTemperature());
	            }
	        });

	        //Open
	        temperatureSensor.open(5000);

	        temperatureSensor.setDataInterval(500);

	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	}
	 
	// No neither the LEDs or Buttons have a data interval. They are not measuring or sensing a value, they are simply taking in input or spitting out output.


