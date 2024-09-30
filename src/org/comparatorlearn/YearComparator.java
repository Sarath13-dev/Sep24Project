package org.comparatorlearn;

import java.util.Comparator;

public class YearComparator implements Comparator<Root>{

	@Override
	public int compare(Root o1, Root o2) {
		if(o1.getYear() > o2.getYear()) {
			return 1;
		}
		else if(o1.getYear() < o2.getYear()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
