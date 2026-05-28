package Events;

import com.phidget22.*;

public class ButtonEvents {

    public static void main(String[] args) throws Exception {
       
       
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
               if (e.getState()) {
            	   System.out.println("Pressed");
               } else {
            	   System.out.println("Not Pressed");
               }
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
               if (e.getState()) {
            	   System.out.println("Pressed");
               } else {
            	   System.out.println("Not Pressed");
               }
            }
        });
        redButton.open(1000);
        greenButton.open(1000);
        
        while (true) {
            Thread.sleep(150);
        }
    }
}
  