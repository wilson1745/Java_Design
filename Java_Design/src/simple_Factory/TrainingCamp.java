package simple_Factory;

public class TrainingCamp {

	public static Adventurer trainAdventurer(String type) {
		switch (type) {
		case "archer": {
			System.out.println("Train the archer");
			return new Archer();
		}
		case "warrior": {
			System.out.println("Train the warrior");
			return new Warrior();
		}
		default:
			return null;
		}
	}

}
