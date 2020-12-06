package template_12.adventurer;

/**
 * @description Adventurer.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public abstract class Adventurer {

	// player's level
	protected int level;

	// player's type
	protected String type;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
