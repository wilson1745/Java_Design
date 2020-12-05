package simple_factory_3.adventurer;

/**
 * @description Warrior (ConcreteProduct)
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class Warrior implements Adventurer {

	@Override
	public String getType() {
		System.out.println("I'm a warrior");

		return this.getClass().getSimpleName();
	}

}
