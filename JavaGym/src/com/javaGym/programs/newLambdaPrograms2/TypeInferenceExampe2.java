package com.javaGym.programs.newLambdaPrograms2;

import java.lang.FunctionalInterface;

public class TypeInferenceExampe2 {

	public static void main(String[] args) {
		GetLengthOfString len = s -> s.length();
		System.out.println(len.getLengthOfString("Sanjay"));
	}

	@FunctionalInterface
	interface GetLengthOfString {
		public abstract int getLengthOfString(String s);
	}

}
