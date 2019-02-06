package factory_Pattern;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import simple_Factory.Adventurer;

public class TrainingCampTest {

	@Test
	public void test() {
		System.out.println("==========工廠模式測試==========");

		TraininCamp trainingCamp = null;
		// 訓練營訓練冒險者
		// 先用弓箭手訓練營訓練弓箭手
		trainingCamp = new ArcherTrainingCamp();
		Adventurer memberA = trainingCamp.trainAdventurer();

		// 用鬥士訓練營訓練鬥士
		trainingCamp = new WarriorTrainingCamp();
		Adventurer memberB = trainingCamp.trainAdventurer();

		// 看看是不是真的訓練出我們想要的冒險者
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");

		// memberB應該是Warrior不是Knight，因此下面這行會報錯
		// Assert.assertEquals(memberB.getType(), "Knight");
	}
}
