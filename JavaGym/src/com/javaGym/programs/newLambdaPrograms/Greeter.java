package com.javaGym.programs.newLambdaPrograms;

import com.javaGym.programs.newLambdaPrograms2.Greeting;
import com.javaGym.programs.newLambdaPrograms2.HelloWorldGreeting;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting greet = new HelloWorldGreeting();
		greeter.greet(greet);
	}

}
