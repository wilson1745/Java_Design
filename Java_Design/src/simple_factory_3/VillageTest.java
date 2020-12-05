package simple_factory_3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import simple_factory_3.adventurer.Adventurer;

public class VillageTest {

	@Test
	public void test() {
		// The fresh
		Adventurer memberA = TrainingCamp.trainAdventurer("Archer");
		Adventurer memberB = TrainingCamp.trainAdventurer("Warrior");

		// Using Junit to assert the kind of warrior
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
	}

}
