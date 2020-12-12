package state_14.state;

import state_14.Warrior;

/**
 * @description UnableState.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class UnableState implements State {

	@Override
	public void move(Warrior warrior) {
		System.out.println("HP = " + warrior.getHp() + ", unable to fight anymore ");
	}

}
