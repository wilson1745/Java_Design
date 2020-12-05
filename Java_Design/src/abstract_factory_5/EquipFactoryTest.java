package abstract_factory_5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import abstract_factory_5.adventurer.Adventurer;
import abstract_factory_5.clothes.Clothes;
import abstract_factory_5.equipfactory.ArcherEquipFactory;
import abstract_factory_5.equipfactory.EquipFactory;
import abstract_factory_5.equipfactory.WarriorEquipFactory;
import abstract_factory_5.trainincamp.ArcherTrainingCamp;
import abstract_factory_5.trainincamp.TraininCamp;
import abstract_factory_5.trainincamp.WarriorTrainingCamp;
import abstract_factory_5.weapon.Weapon;

/**
 * @description Abstract Factory
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class EquipFactoryTest {

	private EquipFactory equipFactory;

	@Test
	public void equipFactoryTest() {
		// Produce archer staff
		equipFactory = new ArcherEquipFactory();
		Clothes archerLeather = equipFactory.productArmor();
		Weapon archerBow = equipFactory.productWeapon();

		Assert.assertEquals(5, archerLeather.getDef());
		Assert.assertEquals(10, archerBow.getAtk());
		Assert.assertEquals(10, archerBow.getRange());

		// Produce warrior staff
		equipFactory = new WarriorEquipFactory();
		Clothes warriorAmor = equipFactory.productArmor();
		Weapon warriorSword = equipFactory.productWeapon();

		Assert.assertEquals(10, warriorAmor.getDef());
		Assert.assertEquals(10, warriorSword.getAtk());
		Assert.assertEquals(1, warriorSword.getRange());

		TraininCamp camp = null;

		// Training archer
		camp = new ArcherTrainingCamp();
		Adventurer archer = camp.trainAdventurer();
		archer.display();

		System.out.println("");

		// Training warrior
		camp = new WarriorTrainingCamp();
		Adventurer warrior = camp.trainAdventurer();
		warrior.display();
	}

}
