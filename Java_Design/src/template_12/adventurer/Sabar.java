package template_12.adventurer;

/**
 * @description Sabar.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class Sabar extends Adventurer {

	public Sabar() {
		super.type = this.getClass().getSimpleName();
		super.level = 10;
	}

}
