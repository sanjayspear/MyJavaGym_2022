package com.javaGym.programs.newLambdaPrograms4;

@FunctionalInterface
public interface MyFunctionalInterface {
	public abstract void m1();

	// public abstract void m(); 
	
	//=> If you uncomment then it is no more functional
	// interface and then you will get error message

	default void m2() {
		System.out.println("Default method 2");
	}

	default void m3() {
		System.out.println("Default method 3");
	}

	default void m4() {
		System.out.println("Default method 4");
	}
}
