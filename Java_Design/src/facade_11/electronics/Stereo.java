package facade_11.electronics;

/**
 * @description Stereo
 * 
 * @author Wilson
 * @date 2020/10/11
 */
public class Stereo extends Electronics {

	// Volume
	private int sound = 50;

	public void setSound(int sound) {
		this.sound = sound;
	}

	public int getSound() {
		return sound;
	}

	@Override
	public void showStatus() {
		super.showStatus();
		System.out.println(this.getClass().getSimpleName() + " volume is " + sound);
	}

}
