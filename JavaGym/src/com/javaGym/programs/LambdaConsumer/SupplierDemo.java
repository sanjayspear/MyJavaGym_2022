package com.javaGym.programs.LambdaConsumer;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		String s = (String) Arrays.asList().stream().findAny().orElseGet(() -> "Hi Viewers");
		
		System.out.println(s);
		
		// This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
        
        System.out.println(randomValue.get());
        
        //Note: Here, get() method is the suppler
	}

}
