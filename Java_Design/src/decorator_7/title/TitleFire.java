package decorator_7.title;

import decorator_7.adventurer.Adventurer;

public class TitleFire extends Title {

	public TitleFire(Adventurer adventurer) {
		super(adventurer);
	}

	@Override
	public void attack() {
		System.out.print("<Fire>, ");
		super.attack();
	}

	public void fireBall() {
		System.out.println("Use the fire ball ");
	}

}
