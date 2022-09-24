package com.javaGym.programs;

import java.util.stream.Stream;

public class StreamExercise7 {

	public static void main(String[] args) {


		Stream<Integer> evenNumbersOnly = Stream.of(1, 2, 7, 3, 5, 9, 2, 3, 4, 5, 6, 7, 1, 8, 8, 9).filter(e -> e % 2 == 0);

		System.out.println("Filter by even Numbers");

		evenNumbersOnly.forEach(System.out::println);

		Stream<Integer> oddNumbersOnly = Stream.of(1, 2, 7, 3, 5, 9, 2, 3, 4, 5, 6, 7, 1, 8, 8, 9).filter(e -> e % 2 != 0);

		System.out.println("Filter by odd Numbers");

		oddNumbersOnly.forEach(System.out::println);

	}

}
