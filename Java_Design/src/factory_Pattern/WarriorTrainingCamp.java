package factory_Pattern;

import simple_Factory.Adventurer;
import simple_Factory.Warrior;

//ôYÊ¿Ó–¾š I(ConcreteFactory)
public class WarriorTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Ó–¾šÒ»‚€ôYÊ¿");
		return new Warrior();
	}
}
