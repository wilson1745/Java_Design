package fight_Strategy;

import org.junit.jupiter.api.Test;

public class FightTest {

	@Test
	public void test() {
		Adventurer ad = new Adventurer();

		System.out.println("���Fʷ�Rķ");
		ad.choiceAttack(new NormalAttack());
		ad.attack();
		System.out.println();

		System.out.println("���F[���޴�]ʷ�Rķ");
		ad.choiceAttack(new UseSkill());
		ad.attack();
		System.out.println();

		System.out.println("���F�»𚙌�");
		ad.choiceAttack(new UseItem());
		ad.attack();
		System.out.println();
	}
}
