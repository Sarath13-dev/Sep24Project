package org.logout;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

//Predicate - Functional Interface

public class Sample {

	//Predicate can also be passed as an Argument
	public static void check(Predicate<Integer> p, int [] a) {
		for(int i=0; i<a.length; i++) {
			boolean test = p.test(a[i]);
			if(test) {
				System.out.println(a[i]);
			}
		}
	}
	
	
public static void main(String[] args) {
//	Predicate<Integer> p =  age -> (age> 18);
//		boolean test = p.test(30);
//		System.out.println(test);
//		
//		
//		Predicate<String> p1 = s -> (s.length()>5);
//		boolean test2 = p1.test("Application");
//		System.out.println(test2);
//		
//		
//		Predicate<List<String>> p2 = li -> (li.contains("java"));
//		List<String> list = new ArrayList();
//		list.add("maven");
//		list.add("python");
//		list.add("java");
//		
//		System.out.println(p2.test(list));
//		
//		
//		Predicate<Integer> p3 = a -> (a%2==0);
//		int [] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for(int i=0; i<x.length; i++) {
//			System.out.println(p3.test(x[i]));
//		}
//		
//		
//		Map<String, Integer> m = new LinkedHashMap();
//		m.put("java", 10);
//		m.put("maven", 20);
//		m.put("python", 30);
//		
//		Set<String> allKeys = m.keySet();//java, maven, python - output - Multiple String(String [], List<String>, Set<String>)
//		
//		Predicate<String> p4 = s -> (s.equals("java"));
//		
//		for(String a1:allKeys) {//allKeys(java, maven, python)
//			System.out.println(p4.test(a1));
//		}
		
		
//		int [] x1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		Predicate<Integer> p5 = a -> (a%2==0);
//		for(int i=0; i<x1.length; i++) {
//			boolean test = p5.test(x1[i]);
//			if(test) {
//				System.out.println(x1[i]);
//			}
//		}
		
		
		int [] x2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Predicate<Integer> p6 = a -> (a%2!=0);
		Predicate<Integer> p7 = a-> (a>5);
		
		//Predicate Chaining - More than one predicate 
		//check(p6.and(p7), x2);
		//check(p6.or(p7), x2);
		check(p6.negate(), x2);
		
		
		
	
}


}
