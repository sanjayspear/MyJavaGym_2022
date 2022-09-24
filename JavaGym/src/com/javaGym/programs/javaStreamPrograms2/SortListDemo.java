package com.javaGym.programs.javaStreamPrograms2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(8);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(7);
		
		System.out.println("Ascending Order");
		list.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("Descending Order");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
