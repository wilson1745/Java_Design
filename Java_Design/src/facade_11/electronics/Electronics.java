package facade_11.electronics;

/**
 * @description Facade
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public abstract class Electronics {

	// Device power on/off
	private boolean power = false;

	// Activate the power
	public void powerOn() {
		this.power = true;
	}

	// Shut down the power
	public void powerOff() {
		this.power = false;
	}

	// Check the status of power
	public boolean isPowerOn() {
		return power;
	}

	// Showing status
	public void showStatus() {
		if (true == power) {
			System.out.println(this.getClass().getSimpleName() + " is currently working");
		} else {
			System.out.println(this.getClass().getSimpleName() + " power is off");
		}
	}

}
