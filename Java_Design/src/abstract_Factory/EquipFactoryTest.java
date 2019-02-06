package abstract_Factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EquipFactoryTest {

private EquipFactory equipFactory;
	
	@Test
	public void equipFactoryTest() {
		System.out.println("=======抽象工廠模式測試=======\n");
		
		// 幫弓箭手生產裝備
		equipFactory = new ArcherEquipFactory();
		Clothes archerLeather = equipFactory.productArmor();
		Weapon archerBow = equipFactory.productWeapon();
		
		Assert.assertEquals(5, archerLeather.getDef());
		Assert.assertEquals(10, archerBow.getAtk());
		Assert.assertEquals(10, archerBow.getRange());
		
		equipFactory = new WarriorEquipFactory();
		Clothes warriorAmor = equipFactory.productArmor();
		Weapon warriorSword = equipFactory.productWeapon();
		
		Assert.assertEquals(10, warriorAmor.getDef());
		Assert.assertEquals(10, warriorSword.getAtk());
		Assert.assertEquals(1, warriorSword.getRange());
		
		// 弓箭手訓練營
		TraininCamp camp = new ArcherTrainingCamp();
		// 訓練弓箭手
		Adventurer archer = camp.trainAdventurer();
		archer.display();

		System.out.println("=======分隔線=======\n");
		
		camp = new WarriorTrainingCamp();
		Adventurer warrior = camp.trainAdventurer();
		warrior.display();

		System.out.println("=======測試成功=======");
	}
}
