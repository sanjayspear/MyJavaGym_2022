package com.javaGym.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// num > 1, divisible by 1 or it self.

		int num = 13;

		int count = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		}
		if (count == 2) {
			System.out.println(num + " Prime Number");
		} else {
			System.out.println(num + " Not Prime Number");
		}
	}
}
