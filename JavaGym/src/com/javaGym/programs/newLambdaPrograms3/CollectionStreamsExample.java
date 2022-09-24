package com.javaGym.programs.newLambdaPrograms3;

import java.util.Arrays;
import java.util.List;

import com.javaGym.programs.newLambdaPrograms2.Person;

public class CollectionStreamsExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Streams using Lambda Expression");

		people.stream().filter(p -> p.getFirstName().startsWith("C")).forEach(p -> System.out.println(p));

		System.out.println("Stremas using method reference");

		people.stream().filter(p -> p.getFirstName().startsWith("C")).forEach(System.out::println);

		System.out.println("Total person count starts with character 'C'");

		long countF = people.stream().filter(p -> p.getFirstName().startsWith("C")).count();

		System.out.println(countF);

		System.out.println("Total person count starts with character 'C'");

		long countL = people.stream().filter(p -> p.getLastname().startsWith("C")).count();

		System.out.println(countL);
		
		System.out.println("Total person count starts with character 'C' using parallel stream");

		long parallelStreamCount = people.parallelStream().filter(p -> p.getLastname().startsWith("C")).count();
		
		System.out.println(parallelStreamCount);
	}

}
