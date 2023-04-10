package tuts.tut10.to_dos.bridge.devices;

public class Radio implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;
	 
	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	//TO-DO: Implement getVolume() method
	@Override
	public int getVolume() {
		return 0;
	}

	//TO-DO: Implement setVolume() method
	@Override
	public void setVolume(int volume) {
		//use 'if-elseif-else' structure to limit the volume from 0 to 100
		//outside the range is invalid
	 
	}

	//TO-DO: Implement getChannel() method
	@Override
	public int getChannel() {
		return 0;
	}

	//TO-DO: Implement setChannel() method
	@Override
	public void setChannel(int channel) {
		 
	}

	//TO-DO: Implement printStatus() method
	@Override
	public void printStatus() {
		//Show the current device is radio
		
		//Show the current status: enabled or disabled
		
		//Show the current volume
		
		//Show the current channel
 
	}
}
