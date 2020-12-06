package facade_11;

import org.junit.Test;

/**
 * @description VideoRoomFacadeClient.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class VideoRoomFacadeClient {

	VideoRoomFacade remote = new VideoRoomFacade();

	@Test
	public void test() {
		// watching movies
		System.out.println(this.getClass().getSimpleName() + "----Watching movies----");
		remote.readyPlayMovie("Life of Pi");
		remote.playMovie();
		remote.showAllStatus();
		System.out.println();

		// turn off devices
		System.out.println(this.getClass().getSimpleName() + "----Turn off devices----");
		remote.turnOffAll();
		remote.showAllStatus();
		System.out.println();

		// watching tv
		System.out.println(this.getClass().getSimpleName() + "----Watching tv----");
		remote.watchTv();
		remote.showTv();
		remote.switchChannel(20);
		remote.showTv();
		remote.turnOffAll();
		System.out.println();

		// having ktv
		System.out.println(this.getClass().getSimpleName() + "----Having ktv----");
		remote.readyKTV();
		remote.selectSong("Moon");
		remote.playSong();
		remote.showAllStatus();
	}

}
