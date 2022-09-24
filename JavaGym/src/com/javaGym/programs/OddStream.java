package com.javaGym.programs;

import java.util.List;
import java.util.stream.Collectors;

public class OddStream {
	public static void main(String[] args) {
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19).stream().filter(i -> isPrime(i))
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static boolean isPrime(int x) {
		int count = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}

		return count == 2;
	}
}
