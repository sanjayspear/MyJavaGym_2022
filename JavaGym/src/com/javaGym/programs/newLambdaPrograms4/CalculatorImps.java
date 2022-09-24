package com.javaGym.programs.newLambdaPrograms4;

public class CalculatorImps {

	public static void main(String[] args) {
		Calculator calculator = () -> System.out.println("Switch on calculator");
		calculator.swithOn();
	}

}

interface Calculator{
	void swithOn();
}
