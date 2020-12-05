package observer_8.adventurer;

public class Gunman extends Adventurer {

	public Gunman(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		if (questions.length() < 10) {
			System.out.println(name + ": I don't want to do this easy task!");
		} else {
			System.out.println(name + ": I'll use my gun to finish this task!");
		}
	}

}
