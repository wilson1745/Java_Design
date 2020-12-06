package facade_11.electronics;

/**
 * @description Television
 * 
 * @author Wilson
 * @date 2020/10/11
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

	public void showTv() {
		System.out.println(this.getClass().getSimpleName() + " current channel: " + channel);
	}

	@Override
	public void showStatus() {
		super.showStatus();

		if (true == isPowerOn()) {
			System.out.println(this.getClass().getSimpleName() + " volume is " + sound);

			switch (source) {
			case "tvBox":
				System.out.println(this.getClass().getSimpleName() + ", Channel: " + channel);
				break;
			case "ktv":
				System.out.println(this.getClass().getSimpleName() + ", Ktv is playing!");
				break;
			case "ps":
				System.out.println(this.getClass().getSimpleName() + ", PS is running!");
				break;
			default:
				break;
			}
		}
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getSound() {
		return sound;
	}

}
