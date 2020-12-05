package adapter_10;

import org.junit.Test;

import adapter_10.archer.Archer;
import adapter_10.archer.NormalArcher;
import adapter_10.wizard.Wizard;

/**
 * @description Adapter
 * 
 * @author Wilson
 * @date 2020年10月11日
 */
public class AdapterClientTest {

	@Test
	public void test() {
		System.out.println("Now we do have an archer!");
		Archer archer = new NormalArcher();
		System.out.println("But, we need fire ball to hit the wall, but we don't have the wizard!");
		System.out.println("Thank god we have an archer who can make the fire arrow instead!\n");

		// Wizard wizard = new Adapter(new NormalArcher());
		Wizard wizard = new Adapter(archer);
		wizard.fireBall();
	}

}
