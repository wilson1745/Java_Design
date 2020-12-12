package state_14.state;

import state_14.Warrior;

/**
 * @description NormalState.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class NormalState implements State {

	@Override
	public void move(Warrior warrior) {
		if (warrior.getHp() > 70) {
			System.out.println("HP = " + warrior.getHp() + ", normal state ");
		} else {
			warrior.setState(new FuryState());
			warrior.move();
		}
	}

}
