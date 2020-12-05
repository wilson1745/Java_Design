package factory_4.trainingcamp;

import factory_4.adventurer.Adventurer;
import factory_4.adventurer.Warrior;

/**
 * @description WarriorTrainingCamp (ConcreteProduct)
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class WarriorTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Train a warrior");
		return new Warrior();
	}

}
