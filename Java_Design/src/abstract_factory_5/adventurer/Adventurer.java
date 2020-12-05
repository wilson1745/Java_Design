package abstract_factory_5.adventurer;

import abstract_factory_5.clothes.Clothes;
import abstract_factory_5.weapon.Weapon;

/**
 * @description product
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public abstract class Adventurer {

	protected Weapon weapon;
	protected Clothes clothes;

	public abstract void display();

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}

}
