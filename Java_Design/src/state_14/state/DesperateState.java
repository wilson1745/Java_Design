package state_14.state;

import state_14.Warrior;

/**
 * @description DesperateState.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class DesperateState implements State {

	@Override
	public void move(Warrior warrior) {
		int hp = warrior.getHp();
		if (hp == 0) {
			warrior.setState(new UnableState());
			warrior.move();
		} else if (hp > 30) {
			warrior.setState(new FuryState());
			warrior.move();
		} else {
			System.out.println("HP = " + warrior.getHp() + ", damage increase 50%, defense increase 50% ");
		}
	}

}
