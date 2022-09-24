package com.javaGym.programs.LambdaConsumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {

		/*Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream().forEach(consumer);*/
		
		//Alternative way
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream().forEach(t -> System.out.println("Print : "+t));
		
	}

}
