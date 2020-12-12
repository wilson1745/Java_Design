package state_14;

import state_14.state.NormalState;
import state_14.state.State;

/**
 * @description Warrior.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class Warrior {

	private int hp;

	private State state;

	public Warrior() {
		this.hp = 100;
		this.state = new NormalState();
	}

	public void heal(int heal) {
		this.hp += heal;
		if (hp > 100) {
			hp = 100;
		}
	}

	public void getDamage(int damage) {
		this.hp -= damage;
		if (hp < 0) {
			hp = 0;
		}
	}

	public void move() {
		this.state.move(this);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
