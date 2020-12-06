package template_12.adventurer;

/**
 * @description Gundam.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class Gundam extends Adventurer {

	public Gundam() {
		super.type = this.getClass().getSimpleName();
		super.level = 100;
	}

}
