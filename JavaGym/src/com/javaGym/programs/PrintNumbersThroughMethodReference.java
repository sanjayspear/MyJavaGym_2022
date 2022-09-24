package com.javaGym.programs;

import java.util.List;

public class PrintNumbersThroughMethodReference {

	static int sum = 0;
	static int multiply=1;

	public static void main(String[] args) {
		printAllNumbersInLsit(List.of(1, 2, 3, 4, 5, 6));

		System.out.println("Total Sum :: " + sum);
		System.out.println("Multiplied Value :: " + multiply);
	}

	private static void print(int num) {

		System.out.println(num);
		sum = sum + num;
		multiply = multiply * num;
	}

	private static void printAllNumbersInLsit(List<Integer> numbers) {
		System.out.println("Numbers are printed using method reference:");
		
		numbers.stream().forEach(PrintNumbersThroughMethodReference::print);
	}

}
