package com.javaGym.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise6 {

	public static void main(String[] args) {

		Stream<Integer> numStream = Stream.of(1, 2, 7, 3, 5, 9, 2, 3, 4, 5, 6, 7, 1, 8, 8, 9);

		List<Integer> doubledList = squearedSteram(numStream);

		System.out.println("Stream of Integers After doubling :: ");

		System.out.println(doubledList);

	}

	private static List<Integer> squearedSteram(Stream<Integer> numStream) {
		return numStream.map(d -> d * d).collect(Collectors.toList());
	}

}
