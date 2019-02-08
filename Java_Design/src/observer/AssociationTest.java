package observer;

import org.junit.Test;

public class AssociationTest {
	
	@Test
	public void test() {
		System.out.println("===== Observer modelObserver Factory =====");
		
		// adventurers
		Adventurer lancer = new Lancer("Jacky");
		Adventurer lancer2 = new Lancer("Seven");
		Adventurer bard = new Bard("Lee");
		Adventurer gunman = new Gunman("LongWu");
		
		Subject association = new Association();
		association.add(lancer);
		association.add(lancer2);
		association.add(bard);
		association.add(gunman);
		
		System.out.println("===== The association is sending an easy job =====");
		association.sendQuestions("run");
		
		System.out.println();
		System.out.println("===== The association is sending an tough job =====");
		association.sendQuestions("run run run, run for your life");
		
		// Seven said he doesn't want a job
		association.remove(lancer2);
		System.out.println();
		System.out.println("===== The association is sending an tough job (Seven has been deleted) =====");
		association.sendQuestions("run run run, run for your life");

	}
}
