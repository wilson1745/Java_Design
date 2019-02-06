package factory_Pattern;

import simple_Factory.Adventurer;
import simple_Factory.Archer;

//¹­¼ıÊÖÓ–¾š I(ConcreteFactory)
public class ArcherTrainingCamp implements TraininCamp {

	@Override
	public Adventurer trainAdventurer() {
		System.out.println("Ó–¾šÒ»‚€¹­¼ıÊÖ");
		return new Archer();
	}
}
