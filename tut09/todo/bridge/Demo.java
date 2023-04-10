package tuts.tut10.to_dos.bridge;

import tuts.tut10.complete.bridge.devices.Device;
import tuts.tut10.complete.bridge.devices.Radio;
import tuts.tut10.complete.bridge.devices.Tv;
import tuts.tut10.complete.bridge.remotes.AdvancedRemote;
import tuts.tut10.complete.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance

		//Power on the device
		 
		//Display the status of device
		 

		System.out.println("Tests with advanced remote.");
		//Create the new AdvancedRemote instance

		//Power on the device
		
		//Mute the device
		 
		//Display the status of device
				 
	}
}
