package com.javaGym.programs.newLambdaPrograms2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		int key = 0;
		
		//Note: What if key is zero. We  get arithmetic exception 

		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
		
	}

	// private static void process(int[] numbers, int k) {
	// for (int num : numbers) {
	// System.out.println(num + key);
	// }

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int num : numbers) {
			consumer.accept(num, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception cought in the wrapper lambda");
			}
		};
	}

}
