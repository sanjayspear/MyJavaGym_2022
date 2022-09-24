package com.javaGym.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExercise2 {

	public static String newLine = System.lineSeparator();

	public static void main(String[] args) {
		List<String> coursesList = List.of("Spring", "Spring Boot", "Microservices", "Azure", "Docker", "Docker");
		List<Integer> numList = List.of(1, 3, 5, 2, 4, 2, 5, 1, 7, 4, 1, 2, 3, 13, 9, 17, 15, 23, 11, 11, 11, 11, 11,
				37);

		System.out.println("==========Frequency of the repeated digits==========" + newLine);
		Map<Integer, Long> dgFreq = digitsFrequency(numList);
		System.out.println(dgFreq);

		stringManipulation(coursesList, "Spring", 9);
		numberManipulation(numList);

	}

	public static void stringManipulation(List<String> coursesList, String course, int stringLength) {
		System.out.println("==========Following are the Courses which contains the String pattern :: " + course
				+ "==========" + newLine);
		coursesList.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);

		System.out.println("==========String length greater >= " + stringLength + " ==========" + newLine);

		coursesList.stream().filter(c -> c.length() >= stringLength).forEach(System.out::println);

		System.out.println("======================================================================" + newLine);

		coursesList.stream().map(c -> "Course Name :: [" + c + "] ==> It's length :: " + c.length())
				.forEach(System.out::println);
	}

	public static void numberManipulation(List<Integer> numList) {
		System.out.println("======================================================================" + newLine);
		numList.stream().map(n -> "The Squre Root of " + n + " is " + n * n).forEach(System.out::println);

		System.out.println("====================Square root of even numbers==========================" + newLine);
		numList.stream().filter(e -> e % 2 == 0).map(n -> "The Squre Root of " + n + " is " + n * n)
				.forEach(System.out::println);

		System.out.println("====================Square root of odd numbers==========================" + newLine);
		numList.stream().filter(e -> e % 2 != 0).map(n -> "The Squre Root of " + n + " is " + n * n)
				.forEach(System.out::println);

		System.out.println("====================Cube root of even numbers==========================" + newLine);
		numList.stream().filter(e -> e % 2 == 0).map(n -> "The Squre Root of " + n + " is " + n * n)
				.forEach(System.out::println);

		System.out.println("====================Cube root of odd numbers==========================" + newLine);
		numList.stream().filter(e -> e % 2 != 0).map(n -> "The Squre Root of " + n + " is " + n * n)
				.forEach(System.out::println);

		System.out.println("============List of prime numbers=========");

		numList.stream().filter(p -> isPrimeNumber(p)).distinct().collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("======================================================================");

		Integer evenSum = numList.stream().filter(e -> e % 2 == 0).reduce(0, (x, y) -> x + y);

		System.out.println("Total sum of the given Even Integer Stream :: " + evenSum);

		Integer oddSum = numList.stream().filter(e -> e % 2 != 0).reduce(0, (x, y) -> x + y);

		System.out.println("Total sum of the given Odd Integer Stream :: " + oddSum);

		Integer primeSum = numList.stream().filter(e -> isPrimeNumber(e)).reduce(0, (x, y) -> x + y);

		System.out.println("Total sum of the given Prime Integer Stream :: " + primeSum);

		System.out.println("Print the total sum through the Method Reference " + newLine);
		Integer totalSum = numList.stream().reduce(0, StreamExercise2::intSum);
		System.out.println("Total Sum :: " + totalSum);

		Integer sumUsingPredefinedSumFunction = numList.stream().reduce(0, Integer::sum);
		System.out.println("Sum Using the Predefined Sum Function :: " + sumUsingPredefinedSumFunction);

	}

	public static Map<Integer, Long> digitsFrequency(List<Integer> numList) {
		Map<Integer, Long> frequencyOfDigits = numList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return frequencyOfDigits;
	}

	public static boolean isPrimeNumber(int prime) {
		int count = 0;
		for (int i = 1; i <= prime; i++) {
			if (prime % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public static int intSum(int x, int y) {
		return x + y;
	}

}
