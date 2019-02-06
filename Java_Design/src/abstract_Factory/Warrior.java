package abstract_Factory;

public class Warrior extends Adventurer {
	
	@Override
	public void display() {
		System.out.println("I'm a warrior, and my gear: ");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}
}
