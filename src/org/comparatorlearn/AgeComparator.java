package org.comparatorlearn;

import java.util.Comparator;

public class AgeComparator implements Comparator<Root>{

	@Override
	public int compare(Root o1, Root o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}
		else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
