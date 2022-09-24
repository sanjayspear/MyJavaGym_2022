package com.javaGym.programs;

public class ReverseAStringWithoutAlteringThePositionOfSpecialCharacter {

	public static void main(String[] args) {

		String s = "We&lco#me";

		char[] arr = s.toCharArray();

		int firstIndex = 0;
		int lastIndex = arr.length - 1;

		while (firstIndex < lastIndex) {
			char head = arr[firstIndex];
			char tail = arr[lastIndex];
			char temp;

			if (!Character.isLetter(head)) {
				firstIndex++;
			} else if (!Character.isLetter(tail)) {
				lastIndex--;
			} else {
				temp = arr[firstIndex];
				arr[firstIndex] = arr[lastIndex];
				arr[lastIndex] = temp;
				firstIndex++;
				lastIndex--;

			}
		}
		System.out.println(arr);
	}

}
