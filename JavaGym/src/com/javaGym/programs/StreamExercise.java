package com.javaGym.programs;

import java.util.List;

public class StreamExercise {

	public static void main(String[] args) {
		List.of("Spring", "Spring Boot", "Microservices", "Azure", "Docker", "Docker").stream()
				.filter(s -> s.contains("Spring")).forEach(System.out::println);

		System.out.println("==================================================================");

		List.of("Spring", "Spring Boot", "Microservices", "Azure", "Docker", "Docker").stream()
				.filter(s -> s.length() >= 9).forEach(System.out::println);

		System.out.println("====================Square of each numbers==========================");
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().map(n -> (n * n)).forEach(System.out::println);

		System.out.println("====================Square of even numbers==========================");

		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(n -> n % 2 == 0).map(n -> (n * n))
				.forEach(System.out::println);

		System.out.println("====================Square of odd numbers==========================");

		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(n -> n % 2 != 0).map(n -> (n * n))
				.forEach(System.out::println);

		System.out.println("====================Cube of each numbers==========================");

		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().map(n -> (n * n * n)).forEach(System.out::println);

		System.out.println(
				"====================Print the number of characters in each course name==========================");

		List.of("Spring", "Spring Boot", "Microservices", "Azure", "Docker").stream().map(c -> c+" =====> String Length is :: "+c.length())
				.forEach(System.out::println);

	}

}
