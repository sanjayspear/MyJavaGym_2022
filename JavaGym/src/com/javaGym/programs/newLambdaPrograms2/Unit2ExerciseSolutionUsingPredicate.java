package com.javaGym.programs.newLambdaPrograms2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit2ExerciseSolutionUsingPredicate {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step:1 Sort list by last name

		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

		System.out.println("=====Printing all persons last name beginnings with 'C'=======");

		printConditionally(people, p -> p.getLastname().startsWith("C"));
		System.out.println("");

		System.out.println("=====Printing all persons first name beginnings with 'C'=======");

		printConditionally(people, p -> p.getFirstName().startsWith("C"));

		printConditionally(people, p -> true);

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}

	}
}
