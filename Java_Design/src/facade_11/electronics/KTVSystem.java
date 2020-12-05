package facade_11.electronics;

/**
 * @description KTV
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public class KTVSystem extends Electronics {

	// Songs
	private String song;

	// Select song
	public void selectSong(String song) {
		this.song = song;
	}

	// Play song
	public void playSong() {
		System.out.println(this.getClass().getSimpleName() + " is playing " + song);
	}

}
