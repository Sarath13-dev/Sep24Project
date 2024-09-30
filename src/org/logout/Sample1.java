package org.logout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sample1 {
	
public static void main(String[] args) {
	
	List<String> li = new ArrayList();
	li.add("java");
	li.add("python");
	li.add("maven");
	li.add("c#");
	li.add("Spring");
	
	//To apply stream concept
	//intermediate operation 
	//filter - to apply a condition and filter the value from collection - Predicate
	//map - compare all the values in collection using some condition - Function
//	Predicate<String> p = s -> (s.length()>4);
//	li.stream().filter(p).forEach(System.out::println);
	
	li.stream().filter(s ->(s.length()>4)).forEach(System.out::println);
	
	//Map
//	Function<String, String> f = s-> (s.toUpperCase());
//	li.stream().map(f).forEach(System.out::println);
	
	li.stream().map(s->(s.toUpperCase())).forEach(System.out::println);
	
	
	
	
}

	

}
