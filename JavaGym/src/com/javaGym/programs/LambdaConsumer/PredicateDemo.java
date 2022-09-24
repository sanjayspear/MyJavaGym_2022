package com.javaGym.programs.LambdaConsumer;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
	public static void main(String[] args) {

		/*Predicate<Integer> predicate = t -> t % 2 ==0;
		
		System.out.println(predicate.test(5));
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream().filter(predicate).forEach(t -> System.out.println("Print Even "+ t));*/
		
		//Alternative way: 1
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print Even "+ t));
		
		//Alternative way: 2
		Arrays.asList(1, 2, 3, 4, 5).stream().filter(t -> t % 2 != 0).forEach(t ->System.out.println("Print Odd : "+t));
		
		
		//Note: filter() method uses predicate and forEach() uses consumer
		
		//[predicate] return true or false where as [consumer] simply consumes whatever we pass doesn't have any return type.
		
	}
}
