package com.javaGym.programs.newLambdaPrograms;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World");

	}

	// This lamda expression assign the value to the variable which actually holding
	// method itself as the variable.
	// If there is one line of code then no need of adding curly braces. However, if
	// it is multiple lines than yu
	// to add curly braces.
	
	// String aBlockOfCode = () -> System.out.println("Hello World!");
	
	//addFunction = (int a, int b) -> a + b;
	
	//safeDivideFunction = (int a, int b) -> {
	//	if (b == 0) return 0;
	//	return a/b;
	//};
	
	// stringLengthCountFunction = (String s) -> s.length();

}
