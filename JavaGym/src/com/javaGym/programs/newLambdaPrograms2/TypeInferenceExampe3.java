package com.javaGym.programs.newLambdaPrograms2;

public class TypeInferenceExampe3 {

	public static void main(String[] args) {
		printLamda(s -> s.length(), s -> s.toLowerCase());
	}
	
	public static void printLamda(GetLengthOfString printlen, ToLowerCaseString revString) {
		System.out.println(printlen.getLengthOfString("Hello Lambda"));
		System.out.println(revString.toLowerCaseStr("NITTE MEENAKSH INSTITUTE"));
	}
	
	interface GetLengthOfString{
		public abstract int getLengthOfString(String s);
	}
	
	interface ToLowerCaseString{
		public abstract String toLowerCaseStr(String s);
	}
	
	// Note: While using the Lambda expressions, the only constrain is, it expects it's interfaces to hold only one abstract method.
	//       these interfaces are also called as functional interfaces.

}
