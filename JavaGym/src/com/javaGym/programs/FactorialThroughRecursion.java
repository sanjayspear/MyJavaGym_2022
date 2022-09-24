package com.javaGym.programs;

public class FactorialThroughRecursion {

	public static void main(String[] args) {

		int fact = fact(5);
		System.out.println(fact);
	}

	public static int fact(int num) {
		if (num >= 1) {
			return num * fact(num - 1);
		}
		return 1;
	}

}
