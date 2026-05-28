package SmartPhidgets;
import com.phidget22.*;

public class TempAndHumidity {

    public static void main(String[] args) throws Exception{

        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

         humiditySensor.open(1000);
        temperatureSensor.open(1000);

        while(true){
           double humidity = humiditySensor.getHumidity();
           double temperature = temperatureSensor.getTemperature();
           
           if (humidity > 30) {
        	   System.out.println("Humidity: " + humidity + "%");
          
           } else {
        	   System.out.println("Humidity is low");
           }
           
           if (temperature > 21) {
        	   System.out.println("Temperature: " + temperature + "°C");
           
           } else {
        	   System.out.println("Room is too cold!");
           }
           Thread.sleep(500);
        }
    }
}
  



