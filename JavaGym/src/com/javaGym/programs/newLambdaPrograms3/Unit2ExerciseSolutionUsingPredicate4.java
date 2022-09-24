
package com.javaGym.programs.newLambdaPrograms3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javaGym.programs.newLambdaPrograms2.Person;

public class Unit2ExerciseSolutionUsingPredicate4 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step:1 Sort list by last name

		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

		System.out.println("=====Printing all persons last name beginnings with 'C'=======");

		performConditionally(people, p -> p.getLastname().startsWith("C"), p -> System.out.println(p));

		performConditionally(people, p -> p.getLastname().startsWith("C"), System.out::println);
		System.out.println("");

	}

	// Consumer<Person> consumer : Consumes 3rd argument as behavior (i.e. p ->
	// System.out.println(p)
	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}
}
