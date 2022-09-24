package com.javaGym.programs.LambdaConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		// filter() => Is used for the conditional check

		List<String> names = new ArrayList<>();

		names.add("Sanjay");
		names.add("Sagar");
		names.add("Sachin");
		names.add("Pranjal");
		names.add("Ashok");

		System.out.println("=======Starts with 'S' =======");

		names.stream().filter(n -> n.startsWith("S")).forEach(n -> System.out.println(n));

		System.out.println("=====Ends with 'l' ===========");

		names.stream().filter(n -> n.endsWith("l")).forEach(System.out::println);

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Sanjay");
		map.put(102, "Sagar");
		map.put(103, "Sachin");
		map.put(104, "Pranjal");
		map.put(105, "Ashok");
		
		System.out.println("Gets only the even entry set");
		map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(System.out::println);
		
		System.out.println("Gets only the odd entry set");
		map.entrySet().stream().filter(key -> key.getKey() % 2 != 0).forEach(System.out::println);

	}

}
