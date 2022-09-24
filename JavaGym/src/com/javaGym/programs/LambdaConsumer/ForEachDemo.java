package com.javaGym.programs.LambdaConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
	    names.add("Sanjay");
	    names.add("Sagar");
	    names.add("Sachin");
	    names.add("Pranjal");
	    names.add("Ashok");
	    
	    //Approach 1
	    
	    System.out.println("=======Printed Using normal Java For Loop=========");
	    
	    for(int i=0; i<names.size(); i++) {
	    	System.out.println(names.get(i));
	    }
	    
	    
	    //Approach 2
	    
	    System.out.println("=======Printed Using Java ForEach=========");
	    
	    for(String s : names) {
	    	System.out.println(s);
	    }
	    
	    //Approach 3
	    
	    System.out.println("=======Printed Using Java Stream API=========");
	    
	    names.stream().forEach(p -> System.out.println(p));
	    
	    Map<Integer, String> map = new HashMap<>();
	    
	    map.put(101, "Sanjay");
	    map.put(102, "Sagar");
	    map.put(103, "Sachin");
	    map.put(104, "Pranjal");
	    map.put(105, "Ashok");
	    
	    map.entrySet().stream().forEach(e -> System.out.println(e));
	    
	    Consumer<String> consumer = s -> System.out.println(s);
	    
	    consumer.accept("Hello Java Stream, I am simply consuming you. So, everyone calls me consumer");
	    consumer.accept("forEach Is one of the example of consumer");
	    
	    Consumer<String> nameConsumers = s -> System.out.println(s);
	    
	    for(String consumeNames : names) {
	    	nameConsumers.accept(consumeNames);
	    }
	    
	    

	}

}
