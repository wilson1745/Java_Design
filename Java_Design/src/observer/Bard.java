package observer;

public class Bard extends Adventurer {

	public Bard(String name) {
		super(name);
	}

	@Override
	public void getQuestions(String questions) {
		if (questions.length() > 10) {
			System.out.println(name + ": I won't do this task, it's too difficult!");
		} else {
			System.out.println(name + ": I think I need more money, so let's do this!");
		}
	}

}
