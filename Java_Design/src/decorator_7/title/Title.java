package decorator_7.title;

import decorator_7.adventurer.Adventurer;

public class Title implements Adventurer {

	protected Adventurer adventurer;

	public Title(Adventurer adventurer) {
		this.adventurer = adventurer;
	}

	@Override
	public void attack() {
		adventurer.attack();
	}

}
