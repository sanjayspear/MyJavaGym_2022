package com.javaGym.programs;

public class AddApproach3 {

	public static void main(String[] args) {
		int num = 1234567890;

		int sum = 0;

		String s = Integer.toString(num);

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			int val = Character.getNumericValue(c);

			sum = sum + val;
		}

		System.out.println(sum);
	}

}
