package concrete_strategy;

import java.util.ArrayList;
import java.util.Collections;

public class StrategyExample {

	public static void main(String[] args) {

		Village apple_Farm = new Village(3, "apple farm", 32, 5.1);
		Village barn_Farm  = new Village(1, "barn farm", 22, 1.7);
		Village cape_Farm  = new Village(2, "cape farm", 10, 10.2);

		ArrayList<Village> villages = new ArrayList<>();
		villages.add(apple_Farm);
		villages.add(barn_Farm);
		villages.add(cape_Farm);

		System.out.println("Unsort data");
		showList(villages);

		System.out.println("\nSort by id");
		Collections.sort(villages, new SortVillageById());
		showList(villages);

		System.out.println("\nSort by area");
		Collections.sort(villages, new SortVillageByArea());
		showList(villages);

		System.out.println("\nSort By population");
		Collections.sort(villages, new SortVillageByPopulation());
		showList(villages);

		System.out.println("\nSort By name");
		Collections.sort(villages, new SortVillageByName());
		showList(villages);
	}

	public static void showList(ArrayList<Village> villages) {
		for (Village v : villages) {
			System.out.println(v);
		}
	}
}
