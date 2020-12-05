package decorator_7;

import org.junit.jupiter.api.Test;

import decorator_7.adventurer.Adventurer;
import decorator_7.adventurer.Lancer;
import decorator_7.title.TitleAgile;
import decorator_7.title.TitleFire;
import decorator_7.title.TitleStrong;

/**
 * @description Decorator
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class TitleTest {

	@Test
	public void test() {

		Adventurer lancer = new Lancer("Jacky");
		System.out.println("--- The lancer Jacky ---");
		lancer.attack();

		System.out.println("\n--- Jacky has received the Strong Title ---");
		TitleStrong sJacky = new TitleStrong(lancer);
		sJacky.attack();

		System.out.println("\n--- Jacky has received the Agile Title ---");
		TitleAgile aJacky = new TitleAgile(sJacky);
		aJacky.attack();
		aJacky.useFlash();

		System.out.println("\n--- Jacky has received the Agile Title ---");
		TitleFire fJacky = new TitleFire(sJacky);
		fJacky.attack();
		fJacky.fireBall();

		System.out.println("\n--- Jacky has received the Strong Title Again!!! ---");
		TitleStrong ssJacky = new TitleStrong(fJacky);
		ssJacky.attack();
	}

}
