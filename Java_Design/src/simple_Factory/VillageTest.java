package simple_Factory;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class VillageTest {

	@Test
	public void test() {
		// The fresh
		Adventurer memberA = TrainingCamp.trainAdventurer("archer");
		Adventurer memberB = TrainingCamp.trainAdventurer("warrior");

		// Using Junit to assert the kind of warrior
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
	}
}
