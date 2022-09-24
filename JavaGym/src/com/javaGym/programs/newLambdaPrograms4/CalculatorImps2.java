package com.javaGym.programs.newLambdaPrograms4;

interface CalSum {
	public abstract void sum(int a);
}

interface CalSub {
	public abstract int substract(int a, int b);
}

public class CalculatorImps2 {

	public static void main(String[] args) {
		int i = 20;

		CalSum sum = (int a) -> System.out.println("Sum is : " + (i + a));
		sum.sum(200);

		//CalSub substract = (s1, s2) -> {
		//	return s2 - s1;
		//};
		
		//CalSub substract = (s1, s2) -> s1 - s2;  // Optimized Syntax
		
		CalSub substract = (s1, s2) -> {
			
			if(s2 < s1) {
				throw new RuntimeException("Arg s2 must be greater than s1");
			}else {
				return s2 - s1;
			}
		};
		
		System.out.println("Substraction is "+substract.substract(20, 50));
	}

}
