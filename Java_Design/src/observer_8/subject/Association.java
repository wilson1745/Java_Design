package observer_8.subject;

import observer_8.adventurer.Adventurer;

public class Association extends Subject {

	@Override
	public void sendQuestions(String questions) {
		for (Adventurer adventurer : adventurerList) {
			adventurer.getQuestions(questions);
		}
	}

}
