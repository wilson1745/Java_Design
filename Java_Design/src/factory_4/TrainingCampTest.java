package factory_4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import factory_4.adventurer.Adventurer;
import factory_4.trainingcamp.ArcherTrainingCamp;
import factory_4.trainingcamp.TraininCamp;
import factory_4.trainingcamp.WarriorTrainingCamp;

/**
 * @description Factory
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class TrainingCampTest {

	@Test
	public void test() {
		TraininCamp trainingCamp = null;

		trainingCamp = new ArcherTrainingCamp();
		Adventurer memberA = trainingCamp.trainAdventurer();

		trainingCamp = new WarriorTrainingCamp();
		Adventurer memberB = trainingCamp.trainAdventurer();

		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
		// Assert.assertEquals(memberB.getType(), "Knight");
	}

}
