package factory_Pattern;

import simple_Factory.Adventurer;
import simple_Factory.Archer;

//������Ӗ���I(ConcreteFactory)
public class ArcherTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Ӗ��һ��������");
		return new Archer();
	}
}
