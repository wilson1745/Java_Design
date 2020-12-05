package strategy_6;

import org.junit.jupiter.api.Test;

import strategy_6.strategy.NormalAttack;
import strategy_6.strategy.UseItem;
import strategy_6.strategy.UseSkill;

/**
 * @description Strategy
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class StrategyTest {

	@Test
	public void test() {
		Adventurer ad = new Adventurer();

		System.out.println("Monster 1");
		ad.choiceAttack(new NormalAttack());
		ad.attack();
		System.out.println();

		System.out.println("Monster 2");
		ad.choiceAttack(new UseSkill());
		ad.attack();
		System.out.println();

		System.out.println("Monster 3");
		ad.choiceAttack(new UseItem());
		ad.attack();
	}

}
