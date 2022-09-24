package com.javaGym.programs.newLambdaPrograms3;

public class MethodReferenceExample3 {

	public static void main(String[] args) {
		// Thread thread = new Thread(() -> printMessage()); // - (1)
		Thread thread = new Thread(MethodReferenceExample3::printMessage); // - (2)
		thread.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

	// Note: Syntax (2) is alternative to the Syntax (1).
}
