package com.demo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoProgram {
	public static void main(String[] args) {
		Map<Integer, Long> frequency = List.of(1, 3, 5, 2, 4, 2, 5, 1, 7, 4, 1, 2, 3).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(frequency);

	}
}
