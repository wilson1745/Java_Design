package abstract_factory_5.equipfactory;

import abstract_factory_5.clothes.Clothes;
import abstract_factory_5.weapon.Weapon;

public interface EquipFactory {

	// product Weapon
	Weapon productWeapon();

	// product Armor
	Clothes productArmor();

}
