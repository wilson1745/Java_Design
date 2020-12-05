package abstract_factory_5.trainincamp;

import abstract_factory_5.adventurer.Adventurer;
import abstract_factory_5.adventurer.Archer;
import abstract_factory_5.equipfactory.ArcherEquipFactory;
import abstract_factory_5.equipfactory.EquipFactory;

public class ArcherTrainingCamp implements TraininCamp {

	private static EquipFactory factory = new ArcherEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Training an archer");

		Archer archer = new Archer();
		archer.setWeapon(factory.productWeapon());
		archer.setClothes(factory.productArmor());

		return archer;
	}

}
