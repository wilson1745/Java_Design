package state_14.state;

import org.junit.Test;

import state_14.Warrior;

/**
 * @description WarriorTest.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class WarriorTest {

	Warrior warrior = new Warrior();

	@Test
	public void test() {
		// HP = 100, normal state
		warrior.move();

		warrior.getDamage(30);
		// HP = 70, fury state
		warrior.move();
		// HP = 20, damage increase 50%, defense increase 50%
		warrior.getDamage(50);
		warrior.move();

		warrior.heal(120);
		// HP = 100, normal state
		warrior.move();

		warrior.getDamage(110);
		// HP = 0, unable to fight anymore
		warrior.move();

		// Once the state become UnableState, this warrior can't fight anymore
		warrior.heal(20);
	}

}
