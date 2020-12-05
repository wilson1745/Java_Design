package strategy_6.village;

import java.util.Comparator;

public class SortVillageByArea implements Comparator<Village> {

	@Override
	public int compare(Village o1, Village o2) {
		if (o1.area > o2.area) {
			return 1;
		} else if (o1.area < o2.area) {
			return -1;
		} else {
			return 0;
		}
	}

}
