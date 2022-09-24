package com.javaGym.programs.newLambdaPrograms2;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter =new Greeter();

		Greeting lamdaGreeting = () -> System.out.println("Hello World, this is the call from the lamda greeting");

		//Anonymous Inner Class
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World, this call is from the Anonymous Inner Class");
			}
		};
		
		//lamdaGreeting.perform();
		
		greeter.greet(lamdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}
