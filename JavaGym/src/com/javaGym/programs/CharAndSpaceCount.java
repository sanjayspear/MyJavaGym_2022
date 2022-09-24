package com.javaGym.programs;

public class CharAndSpaceCount {

	public static void main(String[] args) {
		String s = "Welcome to Java";

		int Charcount = 0;
		int spaceCount = 0;

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];

			if (ch != ' ') {
				Charcount++;
			} else {
				spaceCount++;
			}
		}

		System.out.println("Total number of characters :: " + Charcount);

		System.out.println("Total number of spaces :: " + spaceCount);

	}

}
