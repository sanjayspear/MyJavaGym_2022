package com.javaGym.programs;

import java.util.stream.Stream;

public class StreamExercise3 {

	public static void main(String[] args) {
		System.out.println("Print the maximum value");

		Stream<Integer> intStream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19, 31);
		
		Stream<Integer> intStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19, 31);
		
		Stream<Integer> intStream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19, 31);
		
		Stream<Integer> intStream4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19, 31);
		
		Stream<Integer> intStream5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 4, 15, 16, 17, 18, 19, 31);

		Integer largestNum_0 = intStream1.reduce(0, (x, y) -> x > y ? x : y);

		System.out.println("Largest Number :: " + largestNum_0);

		Integer Min_Value = intStream2.reduce(Integer.MIN_VALUE, (x, y) -> x < y ? x : y);

		System.out.println("Min Number :: " + Min_Value);
		
		Integer Max_Value = intStream3.reduce(Integer.MAX_VALUE, (x, y) -> x > y ? x : y);

		System.out.println("Max Number :: " + Max_Value);
		
		Integer Largest = intStream4.reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);

		System.out.println("Max Number :: " + Largest);
		
		Integer Smallest = intStream5.reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);

		System.out.println("Max Number :: " + Smallest);

	}

}
