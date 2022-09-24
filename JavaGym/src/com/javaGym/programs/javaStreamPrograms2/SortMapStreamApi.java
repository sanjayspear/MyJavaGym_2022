package com.javaGym.programs.javaStreamPrograms2;

import java.util.HashMap;
import java.util.Map;

public class SortMapStreamApi {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put("Eight", 8);
		hm.put("Two", 2);
		hm.put("Ten", 10);
		hm.put("Four", 4);
		
		System.out.println("**********Sorted based on key***********");
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("**********Sorted based on value***********");
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
