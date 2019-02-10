package adapter;

import org.junit.Test;

public class AdapterClient {
	
	@Test
	public void test() {
		System.out.println("===== Start the Adapter Model =====");
		System.out.println("We need fire ball to hit the wall, but we don't have the wizard!");
		System.out.println("Thank god we have an archer who can make the fire arrow instead!\n");
		
		Wizard wizard = new Adapter(new NormalArcher());
		wizard.fireBall();
	}
}
