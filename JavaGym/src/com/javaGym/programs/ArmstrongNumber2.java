package com.javaGym.programs;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		String num = "153";

		Integer sum = 0;

		char[] a = num.toCharArray();

		for (int i = 0; i < a.length; i++) {
			Integer val = Character.getNumericValue(a[i]);

			sum = sum + (val * val * val);
		}

		Integer in = Integer.parseInt(num);

		System.out.println(sum + " == " + in);

		if (sum.equals(in)) {
			System.out.println(sum + " is an armstrong number");
		} else {
			System.out.println(sum + " is not an armstrong number");
		}
	}
}
