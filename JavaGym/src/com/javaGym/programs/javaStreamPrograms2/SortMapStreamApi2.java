package com.javaGym.programs.javaStreamPrograms2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapStreamApi2 {

	public static void main(String[] args) {
		Map<EmployeesList, Integer> empMap = new TreeMap<>((e1, e2) -> (e1.getSal() - e2.getSal()));

		empMap.put(new EmployeesList(111, "Jiya Brein", "HR", 600000), 60);
		empMap.put(new EmployeesList(122, "Paul Nikusi", "Sales And Marketing", 900000), 90);
		empMap.put(new EmployeesList(133, "Martin Theron", "Infrastructure", 500000), 50);
		empMap.put(new EmployeesList(144, "Murali Gowda", "Product Development", 400000), 40);
		empMap.put(new EmployeesList(144, "Murali Gowda", "Product Development", 1200000), 120);

		System.out.println("*******************************Ascending Order************************************");
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeesList::getSal)))
				.forEach(System.out::println);
		
		System.out.println("********************************Descending Order***********************************");
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeesList::getSal).reversed()))
				.forEach(System.out::println);

	}

}
