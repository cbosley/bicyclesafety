public class IoTBike {

	/*
	 * This attempts to play a sound and gather temperature information.
	 * TempToLcd class is adapted from the Intel(R) System Studio IoT Edition IoT examples.
	 */
    public static void main(String[] args) {
  	
    	// Ideally, we'll respond to a button press 
    	// (see TempToLcd for a simple example of using a single button, badly -- it polls every 1000ms,
    	// while we'd like something more instant.
    	
    	// This doesn't even work until sound is configured. I have a paired and connected
    	// bluetooth speaker and cell phone, but am so far unable to successfully play audio.
        Sound.play("mario_08.wav");

        TempToLcd.blockingLoop();
    }
}