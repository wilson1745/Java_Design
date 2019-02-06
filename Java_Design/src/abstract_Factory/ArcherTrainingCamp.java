package abstract_Factory;

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
