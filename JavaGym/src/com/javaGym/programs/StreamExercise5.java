package com.javaGym.programs;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExercise5 {

	public static void main(String[] args) {
		System.out.println("-----------------Distinct Un Sorted-----------------------");

		Stream.of(1, 2, 7, 3, 5, 9, 2, 3, 4, 5, 6, 7, 1, 8, 8, 9).distinct().forEach(System.out::println);

		System.out.println("-----------------Distinct Sorted-----------------------");

		Stream.of(1, 2, 7, 3, 5, 9, 2, 3, 4, 5, 6, 7, 1, 8, 8, 9).distinct().sorted().forEach(System.out::println);

		System.out.println("-----------------Sorted String-----------------------");

		Stream.of("API", "AWS", "Azure", "Docker", "Kubernetes", "Microservices", "PCM", "Spring", "Spring Boot")
				.sorted().forEach(System.out::println);

		System.out.println("-----------------Sorted String In Reverse Order-----------------------");

		Stream.of("API", "AWS", "Azure", "Docker", "Kubernetes", "Microservices", "PCM", "Spring", "Spring Boot")
				.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("-----------------Sorted Based on the length of the String-----------------------");
		
		Stream.of("API", "AWS", "Azure", "Docker", "Kubernetes", "Microservices", "PCM", "Spring", "Spring Boot")
		.sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);

	}

}
