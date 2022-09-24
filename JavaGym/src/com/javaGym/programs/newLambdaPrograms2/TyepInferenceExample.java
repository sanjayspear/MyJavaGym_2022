package com.javaGym.programs.newLambdaPrograms2;

public class TyepInferenceExample {

	public static void main(String[] args) {
		// All are valid syntax you can make use of any of the following:

		// GetLengthLamda getLength = (String s) -> s.length();
		// GetLengthLamda getLength = (s) -> s.length();
		GetLengthLamda getLength = s -> s.length();

		System.out.println(getLength.getLengthLamda("Hello Lambda"));
	}
}
