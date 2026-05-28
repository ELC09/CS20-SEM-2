package Events;

import com.phidget22.*;

public class SmartPhidgets {

	    public static void main(String[] args) throws Exception {

	        //Create
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        //Humidity Event
	        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
	            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
	                System.out.println("Humidity: " + e.getHumidity() + "%");
	            }
	        });

	        //Temperature Event (modified)
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {

	                double temp = e.getTemperature();

	                if (temp > 21) {
	                    System.out.println("Temperature: " + temp + "°C");
	                } else {
	                    System.out.println("Room is too cold");
	                }
	            }
	        });

	        //Open
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);

	        //Keep program running
	        while (true) {
	            Thread.sleep(500);
	        }
	    }
	}

