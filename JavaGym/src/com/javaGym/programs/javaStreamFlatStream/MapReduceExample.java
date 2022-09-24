package com.javaGym.programs.javaStreamFlatStream;

import java.util.Arrays;
import java.util.List;

import com.javaGym.programs.javaStreamPrograms.DataBase;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(3, 4, 2, 5, 6, 8, 9);

		int sumFL = 0;
		for (int i = 0; i < numList.size(); i++) {
			sumFL = sumFL + numList.get(i);
		}

		System.out.println("Sum using the forloop :: " + sumFL);

		int sumEFL = 0;
		for (Integer num : numList) {
			sumEFL = sumEFL + num;
		}

		System.out.println("Sum using the forloop :: " + sumEFL);

		// Sum using the Reduce

		Integer reduceSum = numList.stream().reduce(0, (a, b) -> a + b);

		System.out.println("Sum using reduce :: " + reduceSum);

		Integer reduceSumUSingMethodReference = numList.stream().reduce(Integer::sum).get();

		System.out.println("Sum using the method reference :: " + reduceSumUSingMethodReference);

		Integer reduceMul = numList.stream().reduce(1, (x, y) -> x * y);

		System.out.println("Reduce mul using the Lambda Expression " + reduceMul);

		Integer maxValue = numList.stream().reduce(1, (x, y) -> x > y ? x : y);

		System.out.println(maxValue + " IS Max Value");

		Integer maxValueUsingMethodReference = numList.stream().reduce(Integer::max).get();

		System.out.println("Max method reference " + maxValueUsingMethodReference);
		
		List<String> StringList = Arrays.asList("Selenium", "Java");

		String largestString = StringList.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
		
		System.out.println("Largest String is :: "+largestString+" Its length is :: "+ largestString.length());
		
		double averageSal = DataBase.getEmployees().stream().filter(e -> e.getDepartment()
				.equalsIgnoreCase("Sales And Marketing"))
		        .map(e -> e.getSalary())
		        .mapToInt(e -> e).average().getAsDouble();
		
		System.out.println("The average salary of the [Sales And Marketing] Department is :: "+averageSal);
		
		double sumOfTotalSal = DataBase.getEmployees().stream().filter(e -> e.getDepartment()
				.equalsIgnoreCase("Sales And Marketing"))
		        .map(e -> e.getSalary())
		        .mapToInt(e -> e).sum();
		
		System.out.println("The total budget of the [Sales And Marketing] Department is :: "+sumOfTotalSal);
	}

}
