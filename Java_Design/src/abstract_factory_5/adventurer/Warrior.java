package abstract_factory_5.adventurer;

/**
 * @description Warrior has weapon and clothes
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
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
