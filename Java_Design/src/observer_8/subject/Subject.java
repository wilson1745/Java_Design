package observer_8.subject;

import java.util.ArrayList;
import java.util.List;

import observer_8.adventurer.Adventurer;

public abstract class Subject {

	protected List<Adventurer> adventurerList = new ArrayList<>();

	// The observer wants to receive the notification
	public void add(Adventurer observer) {
		adventurerList.add(observer);
	}

	// The observer doesn't want to receive the notification
	public void remove(Adventurer observer) {
		adventurerList.remove(observer);
	}

	// Pop out the mission statement
	public abstract void sendQuestions(String questions);

}
