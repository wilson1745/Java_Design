package abstract_Factory;

public class Archer extends Adventurer {
	
	@Override
	public void display() {
		System.out.println("I'm an archer, and my gear: ");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}
}
