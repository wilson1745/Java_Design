package abstract_Factory;

public class ArcherEquipFactory implements EquipFactory {

	@Override
	public Weapon productWeapon() {
		Bow product = new Bow();
		product.setAtk(10);
		product.setRange(10);
		
		return product;
	}

	@Override
	public Clothes productArmor() {
		Leather product = new Leather();
		product.setDef(5);
		
		return product;
	}

}
