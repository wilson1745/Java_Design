package observer_8;

import org.junit.Test;

import observer_8.adventurer.Adventurer;
import observer_8.adventurer.Bard;
import observer_8.adventurer.Gunman;
import observer_8.adventurer.Lancer;
import observer_8.subject.Association;
import observer_8.subject.Subject;

/**
 * @description Observer
 * 
 * @author Wilson
 * @date 2020年10月10日
 */
public class AssociationTest {

	@Test
	public void test() {
		// Adventurers
		Adventurer lancerJacky = new Lancer("Jacky");
		Adventurer lancerSeven = new Lancer("Seven");
		Adventurer bardLee = new Bard("Lee");
		Adventurer gunmanLonwu = new Gunman("Longwu");

		// Association
		Subject association = new Association();
		association.add(lancerJacky);
		association.add(lancerSeven);
		association.add(bardLee);
		association.add(gunmanLonwu);

		System.out.println("===== The association is sending an easy job =====");
		association.sendQuestions("run");

		System.out.println();
		System.out.println("===== The association is sending an tough job =====");
		association.sendQuestions("run run run, run for your life");

		// Seven said he doesn't want a job
		association.remove(lancerSeven);
		System.out.println();
		System.out.println("===== The association is sending an tough job (Seven has been deleted) =====");
		association.sendQuestions("run run run, run for your life");
	}

}
