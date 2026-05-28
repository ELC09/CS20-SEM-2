package SimplePhidgets;
import com.phidget22.*;

public class readButton {
   public static void main(String[] args) throws Exception{
        
        DigitalInput greenButton = new DigitalInput();

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        greenButton.open(1000);

         while(true){
        	 
        	 if (greenButton.getState()) {
        		 System.out.println("Green button Clicked!");
        		 
        		 Thread.sleep(300);
        	 }
        }
    }
}
  

