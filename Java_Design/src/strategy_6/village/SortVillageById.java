package strategy_6.village;

import java.util.Comparator;

// Using ID to sort (Concrete Strategy)
public class SortVillageById implements Comparator<Village> {

	@Override
	public int compare(Village o1, Village o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
