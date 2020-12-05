package abstract_factory_5.equipfactory;

import abstract_factory_5.clothes.Armor;
import abstract_factory_5.clothes.Clothes;
import abstract_factory_5.weapon.LongSword;
import abstract_factory_5.weapon.Weapon;

public class WarriorEquipFactory implements EquipFactory {

	@Override
	public Weapon productWeapon() {
		LongSword weapon = new LongSword();
		weapon.setAtk(10);
		weapon.setRange(1);

		return weapon;
	}

	@Override
	public Clothes productArmor() {
		Armor clothes = new Armor();
		clothes.setDef(10);

		return clothes;
	}

}
