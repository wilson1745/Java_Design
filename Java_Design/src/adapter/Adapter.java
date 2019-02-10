package adapter;

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
