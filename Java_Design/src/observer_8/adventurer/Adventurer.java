package observer_8.adventurer;

public abstract class Adventurer {

	protected String name;

	public Adventurer(String name) {
		this.name = name;
	}

	// receiving the tasks
	public abstract void getQuestions(String questions);

}
