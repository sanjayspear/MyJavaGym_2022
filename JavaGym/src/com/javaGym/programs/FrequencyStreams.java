package com.javaGym.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyStreams {

	public static void main(String[] args) {
		findFrequency(List.of(1, 3, 5, 2, 4, 2, 5, 1, 7, 4, 1, 2, 3, 5, 5, 5));
	}

	private static void findFrequency(List<Integer> numbers) {
		Map<Integer, Long> frequency = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(frequency);
	}

}
