package abstract_factory_5.equipfactory;

import abstract_factory_5.clothes.Clothes;
import abstract_factory_5.clothes.Leather;
import abstract_factory_5.weapon.Bow;
import abstract_factory_5.weapon.Weapon;

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
