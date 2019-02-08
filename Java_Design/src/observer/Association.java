package observer;

public class Association extends Subject {

	@Override
	public void sendQuestions(String questions) {
		for (Adventurer adventurer : list) {
			adventurer.getQuestions(questions);
		}

	}

}
