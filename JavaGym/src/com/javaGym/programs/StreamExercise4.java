package com.javaGym.programs;

import java.util.stream.Stream;

public class StreamExercise4 {

	public static void main(String[] args) {
		Stream<Integer> Stream_001 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> Stream_002 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> Stream_003 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Integer sumOfSquare = Stream_001.map(n -> n * n).reduce(0, Integer::sum);

		System.out.println("Sum of Squeare :: " + sumOfSquare);

		Integer sumOfCube = Stream_002.map(c -> c * c * c).reduce(0, Integer::sum);

		System.out.println("Sum of Cube :: " + sumOfCube);

		Integer sumOfOddNumbers = Stream_003.filter(o -> o % 2 != 0).reduce(0, Integer::sum);

		System.out.println("------------------------");
		System.out.println("List of odd numbers :");
		System.out.println("------------------------");

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(e -> e % 2 != 0).forEach(System.out::println);

		System.out.println("------------------------");
		System.out.println("Sum of Odd Numbes :: " + sumOfOddNumbers);
		System.out.println("------------------------"+StreamExercise2.newLine);

		System.out.println("------------------------");
		System.out.println("List of even numbers :");
		System.out.println("------------------------");

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(e -> e % 2 == 0).forEach(System.out::println);

		Integer sumOfevenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(e -> e % 2 == 0).reduce(0, Integer::sum);

		System.out.println("------------------------");
		System.out.println("Sum of Even Numbes :: " + sumOfevenNumbers);
		System.out.println("------------------------");

	}

}
