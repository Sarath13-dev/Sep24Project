package org.comparatorlearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementation {
	
	public static void main(String[] args) {
		Root r = new Root();
		r.setName("Ravi");
		r.setAge(30);
		r.setYear(1990);
		
		Root r1 = new Root();
		r1.setName("Babu");
		r1.setAge(40);
		r1.setYear(1980);
		
		Root r2 = new Root();
		r2.setName("Anand");
		r2.setAge(20);
		r2.setYear(2000);
		
		List<Root> li = new ArrayList();
		li.add(r);
		li.add(r1);
		li.add(r2);
		
		//Name Comparator
		NameComparator n = new NameComparator();
		Collections.sort(li, n);
		
		for(Root x:li) {
			System.out.println(x.getName()+" "+ x.getAge()+" "+ x.getYear());
		}
		
		System.out.println("==============================");
		//Age Comparator
		AgeComparator a = new AgeComparator();
		Collections.sort(li, a);
		
		for(Root x:li) {
			System.out.println(x.getName()+" "+ x.getAge()+" "+ x.getYear());
		}
		
		System.out.println("====================");
		//year Comparator
		YearComparator y = new YearComparator();
		Collections.sort(li, y);
		
		for(Root x:li) {
			System.out.println(x.getName()+" "+ x.getAge()+" "+ x.getYear());
		}
		
		
		
	}

}
