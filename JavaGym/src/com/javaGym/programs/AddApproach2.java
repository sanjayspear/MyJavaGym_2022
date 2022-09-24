package com.javaGym.programs;

public class AddApproach2 {

	public static void main(String[] args) {
		Integer num = 53219876;

		char[] ch = num.toString().toCharArray();

		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			sum = sum + Character.getNumericValue(ch[i]);
		}

		System.out.println("Total Sum " + sum);
	}

}
