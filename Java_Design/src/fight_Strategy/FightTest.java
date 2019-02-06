package fight_Strategy;

import org.junit.jupiter.api.Test;

public class FightTest {

	@Test
	public void test() {
		Adventurer ad = new Adventurer();

		System.out.println("出現史萊姆");
		ad.choiceAttack(new NormalAttack());
		ad.attack();
		System.out.println();

		System.out.println("出現[超巨大]史萊姆");
		ad.choiceAttack(new UseSkill());
		ad.attack();
		System.out.println();

		System.out.println("出現怕火殭屍");
		ad.choiceAttack(new UseItem());
		ad.attack();
		System.out.println();
	}
}
