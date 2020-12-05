package facade_11.electronics;

/**
 * @description PlayStation3
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public class PlayStation3 extends Electronics {

	// Game disk
	private String cd;

	public void putCd(String cd) {
		this.cd = cd;
	}

	public String getCd() {
		return cd;
	}

	// Run cd
	public void play() {
		System.out.println(this.getClass().getSimpleName() + " starts playing the " + cd);
	}

	@Override
	public void showStatus() {
		super.showStatus();
		System.out.println(this.getClass().getSimpleName() + " currently playing the " + cd);
	}

}
