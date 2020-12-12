package proxy_15;

import org.junit.Test;

import proxy_15.gamedisplay.ProxyGameDisplay;
import proxy_15.gamedisplay.RealGameDisplay;

/**
 * @description GameLoadTest.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class GameLoadTest {

	@Test
	public void test() {
		System.out.println("Without proxy");
		new RealGameDisplay().display();
		System.out.println();

		System.out.println("With proxy");
		new ProxyGameDisplay(new RealGameDisplay()).display();
	}

}
