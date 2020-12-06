package facade_11;

import facade_11.electronics.KTVSystem;
import facade_11.electronics.PlayStation3;
import facade_11.electronics.Stereo;
import facade_11.electronics.Television;

/**
 * @description Manage the media facade
 *
 * @author wilso
 * @date 2020/12/06
 */
public class VideoRoomFacade {

	// the whole devices in this room
	Television tv = new Television();
	Stereo stereo = new Stereo();
	PlayStation3 ps = new PlayStation3();
	KTVSystem ktv = new KTVSystem();

	/** ready to watch movies by ps. */
	public void readyPlayMovie(String cd) {
		// turn on the stereo
		stereo.powerOn();
		// turn on the tv
		tv.powerOn();
		// set volume
		setSound(50);
		// switch the tv source to ps
		tv.switchSource("ps");
		// turn on the ps
		ps.powerOn();
		// put the game disk
		ps.putCd(cd);
	}

	/** use ps to play movies. */
	public void playMovie() {
		if (ps.isPowerOn()) {
			ps.play();
		}
	}

	// show tv channel
	public void showTv() {
		tv.showTv();
	}

	private void setSound(int soundLevel) {
		if (tv.isPowerOn()) {
			tv.setSound(soundLevel);
		}
		if (stereo.isPowerOn()) {
			stereo.setSound(soundLevel);
		}
	}

	/**
	 * display the status of all devices
	 */
	public void showAllStatus() {
		System.out.println("\n" + this.getClass().getSimpleName() + " showAllStatus() start");
		tv.showStatus();
		stereo.showStatus();
		ps.showStatus();
		ktv.showStatus();
		System.out.println(this.getClass().getSimpleName() + " showAllStatus() end" + "\n");
	}

	/**
	 * turn off all the devices
	 */
	public void turnOffAll() {
		tv.powerOff();
		stereo.powerOff();
		ps.powerOff();
		ktv.powerOff();
	}

	/**
	 * watching tv
	 */
	public void watchTv() {
		// turn on the tv
		tv.powerOn();
		// switch to TV source
		tv.switchSource("tvBox");
	}

	/**
	 * selecting the channel.
	 */
	public void switchChannel(int channel) {
		tv.switchChannel(channel);
	}

	/**
	 * check everything which ktv needs.
	 */
	public void readyKTV() {
		stereo.powerOn();
		ktv.powerOn();
		tv.powerOn();
		setSound(50);
		tv.switchSource("ktv");
	}

	/**
	 * select a song.
	 */
	public void selectSong(String song) {
		if (ktv.isPowerOn()) {
			ktv.selectSong(song);
		}
	}

	/**
	 * playing the song.
	 */
	public void playSong() {
		if (ktv.isPowerOn()) {
			ktv.playSong();
		}
	}

}
