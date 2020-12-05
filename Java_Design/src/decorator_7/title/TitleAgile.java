package decorator_7.title;

import decorator_7.adventurer.Adventurer;

public class TitleAgile extends Title {

	public TitleAgile(Adventurer adventurer) {
		super(adventurer);
	}

	@Override
	public void attack() {
		System.out.print("<Agile>, ");
		super.attack();
	}

	public void useFlash() {
		System.out.println("Use agile movement ");
	}

}
