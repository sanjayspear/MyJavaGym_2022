package com.javaGym.programs;

import java.util.ArrayList;

public class FindNameStartsWithEndsWithContainsUsingStream {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Adam");
		names.add("David");
		names.add("Alekhya");
		names.add("Stalin");
		names.add("Ash");
		names.add("Abhilash");
		names.add("Arvind");
		names.add("Rashmi");
		names.add("Akanksh");

		System.out.println("List of names starts with 'A'");
		names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

		System.out.println("==============================");

		System.out.println("List names ends with h");
		names.stream().filter(n -> n.endsWith("h")).forEach(System.out::println);

		System.out.println("==============================");

		System.out.println("List names contains 'h'");
		names.stream().filter(n -> n.contains("h")).forEach(System.out::println);
	}

}
