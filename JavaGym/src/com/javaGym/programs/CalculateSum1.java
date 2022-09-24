package com.javaGym.programs;

import java.util.List;

public class CalculateSum1 {
	public static void main(String[] args) {
		int total=printAllNumbersInLsit(List.of(1, 2, 3, 4, 5, 6));
		
		System.out.println("Total Sum :: "+total);
	}

	private static int printAllNumbersInLsit(List<Integer> numbers) {
		int sum = 0;
		for (Integer num : numbers) {
			sum = sum + num;

		}

		return sum;
	}
}
