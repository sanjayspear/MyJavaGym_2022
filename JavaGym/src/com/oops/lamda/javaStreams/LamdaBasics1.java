package com.oops.lamda.javaStreams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaBasics1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		for (int num : numbers) {
			System.out.println(num);
		}

		System.out.println("==============================");

		numbers.forEach(n -> System.out.println(n));
		
		System.out.println("==============================");
		
		Consumer<Integer> method = n -> System.out.println(n);
		
		numbers.forEach(method);
	}

}
