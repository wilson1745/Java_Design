package observer;

public class Lancer extends Adventurer {

	public Lancer(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		System.out.println(name + ": I'll accomplish the task without fear!");
	}

}
