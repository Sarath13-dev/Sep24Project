package org.comparatorlearn;

import java.util.Comparator;

public class NameComparator implements Comparator<Root> {

	@Override
	public int compare(Root o1, Root o2) {
		if(o1.getName().charAt(0) > o2.getName().charAt(0)) {
			return 1;
		}
		else if(o1.getName().charAt(0) < o2.getName().charAt(0)) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
