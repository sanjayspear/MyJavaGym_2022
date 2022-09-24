package com.javaGym.programs.newLambdaPrograms3;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> printMessage());
		thread.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
