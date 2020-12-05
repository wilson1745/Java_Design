package strategy_6;

import strategy_6.strategy.FightStrategy;
import strategy_6.strategy.NormalAttack;

public class Adventurer {

	private FightStrategy fightStrategy;

	public void attack() {
		if (null == fightStrategy) {
			fightStrategy = new NormalAttack();
		}

		fightStrategy.execute();
	}

	public void choiceAttack(FightStrategy strategy) {
		this.fightStrategy = strategy;
	}

}
