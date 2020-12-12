package state_14.state;

import state_14.Warrior;

/**
 * @description State.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public interface State {

	/**
	 * get the state from warrior.
	 */
	void move(Warrior warrior);

}
