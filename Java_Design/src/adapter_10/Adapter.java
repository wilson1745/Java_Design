package adapter_10;

import adapter_10.archer.Archer;
import adapter_10.wizard.Wizard;

public class Adapter implements Wizard {

	private Archer archer;
	
	public Adapter(Archer archer) {
		this.archer = archer;
	}

	@Override
	public void fireBall() {
		System.out.println("Put oil on the arrow -> Fire in the hole");
		archer.shot();
		System.out.println("The fire ball has been shot!");
	}

}
