package proxy_15.gamedisplay;

/**
 * @description ProxyGameDisplay.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class ProxyGameDisplay implements GameDisplay {

	private RealGameDisplay realGameDisplay;

	public ProxyGameDisplay(RealGameDisplay realGameDisplay) {
		this.realGameDisplay = realGameDisplay;
	}

	@Override
	public void display() {
		System.out.println("Game is loading...");
		realGameDisplay.display();
	}

}
