package org.streamapi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Implementation {
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Ravi", 30000, 40);
		Employee e1 = new Employee("Babu", 20000, 25);
		Employee e2 = new Employee("Rishi", 50000, 38);
		
		//User defined List
		List<Employee> li = new ArrayList();
		li.add(e);
		li.add(e1);
		li.add(e2);
		
//		Predicate<Employee> p =  emp -> (emp.getSalary()> 40000);
//		Function<Employee, String> f = emp -> (emp.getName());
		li.stream().filter(emp -> emp.getSalary()>40000).
		map(emp -> emp.getName()).forEach(System.out::println);
	
		
		//print age > 30
		li.stream().filter(emp -> emp.getAge() >30)
		.map(emp -> emp.getName()).forEach(System.out::println);
		
		
		Map<String, Integer> m = new LinkedHashMap();
		m.put("Java", 10);
		m.put("maven", 5);
		m.put("Selenium", 20);
		
		//Get all the keys of the map
		Set<String> allkeys = m.keySet();
		allkeys.stream().filter(s ->(s.length()>4))
		.map(s -> s.toUpperCase()).forEach(System.out::println);
		
		
		
	}

}
