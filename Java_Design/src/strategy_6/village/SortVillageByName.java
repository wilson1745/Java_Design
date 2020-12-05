package strategy_6.village;

import java.util.Comparator;

public class SortVillageByName implements Comparator<Village> {

	@Override
	public int compare(Village o1, Village o2) {
		if (o1.name.charAt(0) > o2.name.charAt(0)) {
			return 1;
		} else if (o1.name.charAt(0) < o2.name.charAt(0)) {
			return -1;
		} else {
			return 0;
		}
	}

}
