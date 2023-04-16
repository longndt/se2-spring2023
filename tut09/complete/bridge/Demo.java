package tuts.tut10.complete.bridge;

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

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
