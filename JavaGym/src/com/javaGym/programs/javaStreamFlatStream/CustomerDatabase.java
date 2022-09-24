package com.javaGym.programs.javaStreamFlatStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

	public static List<Customer> getAll() {
		return Stream
				.of(new Customer(101, "John", "john@gmail.com", Arrays.asList("784356", "894563")),
						new Customer(102, "smith", "smith@gmail.com", Arrays.asList("765389", "947240")),
						new Customer(103, "peter", "peter@gmail.com", Arrays.asList("856345", "984563")),
						new Customer(104, "Kely", "kely@gmail.com", Arrays.asList("524679", "945734")))
				.collect(Collectors.toList());
	}
}
