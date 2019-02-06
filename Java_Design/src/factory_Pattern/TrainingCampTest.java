package factory_Pattern;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import simple_Factory.Adventurer;

public class TrainingCampTest {

	@Test
	public void test() {
		System.out.println("==========���Sģʽ�yԇ==========");

		TraininCamp trainingCamp = null;
		// Ӗ���IӖ��ð�U��
		// ���ù�����Ӗ���IӖ��������
		trainingCamp = new ArcherTrainingCamp();
		Adventurer memberA = trainingCamp.trainAdventurer();

		// ���YʿӖ���IӖ���Yʿ
		trainingCamp = new WarriorTrainingCamp();
		Adventurer memberB = trainingCamp.trainAdventurer();

		// �����ǲ������Ӗ�����҂���Ҫ��ð�U��
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");

		// memberB��ԓ��Warrior����Knight����������@�Е����e
		// Assert.assertEquals(memberB.getType(), "Knight");
	}
}
