package abstract_factory_5.adventurer;

/**
 * @description Archer has weapon and clothes
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
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
