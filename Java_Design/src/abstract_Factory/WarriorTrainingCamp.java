package abstract_Factory;

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
