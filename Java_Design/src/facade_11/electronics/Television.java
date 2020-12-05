package facade_11.electronics;

/**
 * @description Television
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public class Television extends Electronics {

	private int sound = 50;
	private String source = "tvBox";
	private int channel = 9;

	public void switchSource(String source) {
		this.source = source;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public void switchChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void showStatus() {
		super.showStatus();

		if (true == isPowerOn()) {
			System.out.println(this.getClass().getSimpleName() + " the volume is " + sound);

			// switch (key) {
			// case value:
			//
			// break;
			//
			// default:
			// break;
			// }
		}

		System.out.println(this.getClass().getSimpleName() + " currently playing the " + cd);
	}

}
