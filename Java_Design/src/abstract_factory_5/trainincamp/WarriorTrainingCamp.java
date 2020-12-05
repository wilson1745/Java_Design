package abstract_factory_5.trainincamp;

import abstract_factory_5.adventurer.Adventurer;
import abstract_factory_5.adventurer.Warrior;
import abstract_factory_5.equipfactory.EquipFactory;
import abstract_factory_5.equipfactory.WarriorEquipFactory;

public class WarriorTrainingCamp implements TraininCamp {

	private static EquipFactory factory = new WarriorEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Training an warrior");

		Warrior warrior = new Warrior();
		warrior.setWeapon(factory.productWeapon());
		warrior.setClothes(factory.productArmor());

		return warrior;
	}

}
