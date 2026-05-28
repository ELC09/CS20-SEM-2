package Methods;

import com.phidget22.*;

public class LEDBrightness {
 	public static void main(String[] argos) throws Exception {

	DigitalOutput redLED = new DigitalOutput();

	redLED.setHubPort(1);
	redLED.setIsHubPortDevice(true);

	redLED.open(1000);

	for (double i = 0.0; i <= 1.0; i += 0.05) {
		redLED.setDutyCycle(i);
		Thread.sleep(50);
}

	for (double i = 1.0; i>= 0.0; i -= 0.05) {
		redLED.setDutyCycle(i);
		Thread.sleep(50);
}

	redLED.setDutyCycle(0.0);
 	}
}


//Duty Cycle - Changes the perceived brightness of the LED. It works by rapidly blinking the LED on and off.