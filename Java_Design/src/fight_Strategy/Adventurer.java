package fight_Strategy;

public class Adventurer {

	FightStrategy fightStrategy;
	
	public void attack() {
		if (fightStrategy == null) {
			fightStrategy = new NormalAttack();
		}
		
		fightStrategy.execute();
	}
	
	public void choiceAttack(FightStrategy strategy) {
		this.fightStrategy = strategy;
	}
}
