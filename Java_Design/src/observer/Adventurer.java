package observer;

public abstract class Adventurer {
	
	protected String name;

	public Adventurer(String name) {
		super();
		this.name = name;
	}
	
	// receiving the tasks
	public abstract void getQuestions(String questions);
}
