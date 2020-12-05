package factory_4.trainingcamp;

import factory_4.adventurer.Adventurer;
import factory_4.adventurer.Archer;

/**
 * @description ArcherTrainingCamp (ConcreteProduct)
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class ArcherTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Train an Archer");
		return new Archer();
	}

}
