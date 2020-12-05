package decorator_7.title;

import decorator_7.adventurer.Adventurer;

public class TitleStrong extends Title {

	public TitleStrong(Adventurer adventurer) {
		super(adventurer);
	}

	@Override
	public void attack() {
		System.out.print("<Strong>, ");
		super.attack();
	}

}
