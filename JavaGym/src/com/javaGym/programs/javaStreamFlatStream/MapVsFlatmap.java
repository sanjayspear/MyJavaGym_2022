package com.javaGym.programs.javaStreamFlatStream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmap {

	public static void main(String[] args) {
		List<Customer> customers = CustomerDatabase.getAll();

		// List<Customer> convert to List<String> = Data Transformation.

		// mapping : customer -> customer.getEmail()

		// customer.getEmail() ==> one to one mapping (Because one customer has only one
		// email id)

		List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		// customers ==> c -> c.getPhone() ==> one to many mapping
		List<List<String>> phNumbers = customers.stream().map(c -> c.getPhone()).collect(Collectors.toList());
		System.out.println(phNumbers);

		// Note: If requirement is one to one mapping than use the map. If you have the
		// requirement of one to many mapping than use flat map.
		
		// Stream of Stream ==> [[784356, 894563], [765389, 947240], [856345, 984563], [524679, 945734]]
		// After data flattering ==> [784356, 894563, 765389, 947240, 856345, 984563, 524679, 945734]

		List<String> phoneNumbers = customers.stream().flatMap(c -> c.getPhone().stream()).collect(Collectors.toList());

		System.out.println(phoneNumbers);
	}

}
