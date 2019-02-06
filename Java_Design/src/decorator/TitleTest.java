package decorator;

import org.junit.jupiter.api.Test;

public class TitleTest {

	@Test
	public void test() {
		System.out.println("======== Decorator Mode ========");

		Adventurer lancer = new Lancer("Jacky");
		System.out.println("--- The lancer Jacky ---");
		lancer.attack();

		System.out.println();
		System.out.println("--- Jacky has received the Strong Title ---");
		TitleStrong sJacky = new TitleStrong(lancer);
		sJacky.attack();

		System.out.println();
		System.out.println("--- Jacky has received the Agile Title ---");
		TitleAgile aJacky = new TitleAgile(sJacky);
		aJacky.attack();
		aJacky.useFlash();

		System.out.println();
		System.out.println("--- Jacky has received the Agile Title ---");
		TitleFire fJacky = new TitleFire(sJacky);
		fJacky.attack();
		fJacky.fireBall();

		System.out.println();
		System.out.println("--- Jacky has received the Strong Title Again!!! ---");
		TitleStrong ssJacky = new TitleStrong(fJacky);
		ssJacky.attack();
	}
}
