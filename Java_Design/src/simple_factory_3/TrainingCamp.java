package simple_factory_3;

import simple_factory_3.adventurer.Adventurer;
import simple_factory_3.adventurer.Archer;
import simple_factory_3.adventurer.Warrior;

/**
 * @description Simple Factory
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class TrainingCamp {

	public static Adventurer trainAdventurer(String type) {
		switch (type) {
			case "Archer":
				System.out.println("Train an archer");
				return new Archer();
			case "Warrior":
				System.out.println("Train a warrior");
				return new Warrior();
			default:
				return null;
		}
	}

}
