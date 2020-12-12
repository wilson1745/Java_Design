package state_14.state;

import state_14.Warrior;

/**
 * @description FuryState.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class FuryState implements State {

	@Override
	public void move(Warrior warrior) {
		int hp = warrior.getHp();
		if (hp > 70) {
			warrior.setState(new NormalState());
			warrior.move();
		} else if (hp <= 30) {
			warrior.setState(new DesperateState());
			warrior.move();
		} else {
			System.out.println("HP = " + warrior.getHp() + ", fury state ");
		}
	}

}
