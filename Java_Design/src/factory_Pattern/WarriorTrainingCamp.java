package factory_Pattern;

import simple_Factory.Adventurer;
import simple_Factory.Warrior;

//�YʿӖ���I(ConcreteFactory)
public class WarriorTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Ӗ��һ���Yʿ");
		return new Warrior();
	}
}
