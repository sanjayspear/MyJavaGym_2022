package com.javaGym.programs;

import java.util.List;

public class EvenStream {

	public static void main(String[] args) {
		printAllNumbersInLsit(List.of(1, 2, 3, 4, 5, 6));
	}

	private static void printAllNumbersInLsit(List<Integer> numbers) {
		System.out.println("Even Numbers");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
