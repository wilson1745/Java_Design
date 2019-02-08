package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	protected List<Adventurer> list = new ArrayList<>();

	// the observer wants to receive the notification
	public void add(Adventurer observer) {
		list.add(observer);
	}
	
	// the observer doesn't want to receive the notification
	public void remove(Adventurer observer) {
		list.remove(observer);
	}
	
	// post out the mission statement
	public abstract void sendQuestions(String questions);
}
