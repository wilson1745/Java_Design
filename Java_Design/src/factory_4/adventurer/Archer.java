package factory_4.adventurer;

/**
 * @description Archer (ConcreteProduct)
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class Archer implements Adventurer {

	@Override
	public String getType() {
		System.out.println("I'm an archer");

		// return "Archer"
		return this.getClass().getSimpleName();
	}

}
