package abstract_Factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EquipFactoryTest {

private EquipFactory equipFactory;
	
	@Test
	public void equipFactoryTest() {
		System.out.println("=======���󹤏Sģʽ�yԇ=======\n");
		
		// �͹��������a�b��
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
		
		// ������Ӗ���I
		TraininCamp camp = new ArcherTrainingCamp();
		// Ӗ��������
		Adventurer archer = camp.trainAdventurer();
		archer.display();

		System.out.println("=======�ָ���=======\n");
		
		camp = new WarriorTrainingCamp();
		Adventurer warrior = camp.trainAdventurer();
		warrior.display();

		System.out.println("=======�yԇ�ɹ�=======");
	}
}
