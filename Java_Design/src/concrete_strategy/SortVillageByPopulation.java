package concrete_strategy;

import java.util.Comparator;

public class SortVillageByPopulation implements Comparator<Village>{

	@Override
	public int compare(Village o1, Village o2) {
		if (o1.population > o2.population) return 1;
		else if (o1.population < o2.population) return -1;
		else return 0;
	}
	
}
