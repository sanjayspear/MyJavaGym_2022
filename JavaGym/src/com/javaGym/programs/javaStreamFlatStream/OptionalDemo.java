package com.javaGym.programs.javaStreamFlatStream;

import java.util.List;

public class OptionalDemo {

	public static Customer getCustomerEmailId(String email) throws Exception {
		List<Customer> customers = CustomerDatabase.getAll();

		return customers.stream().filter(c -> c.getEmail().equals(email)).findAny().orElseThrow(() -> new Exception(
				"There is no such email id : named as [" + email + "] present in the [CUSTOMER DATABASE]"));
	}

	public static void main(String[] args) throws Exception {
		// Customer customer = new Customer(102, "smith", null, Arrays.asList("765389",
		// "947240"));

		// Optional<Object> emptyOptional = Optional.empty();
		// System.out.println(emptyOptional);

		// Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		// // Don't throw null pointer exception
		// System.out.println(emailOptional2);

		// Optional<String> emailOptional3 = Optional.of(customer.getEmail()); //it
		// throws null pointer exception because it check for Null
		// System.out.println(emailOptional3);

		// System.out.println(emailOptional3.orElseThrow(() -> new
		// IllegalAccessException("Email not present")));

		// System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() ->
		// "default email ..."));

		Customer email = getCustomerEmailId("sanjay@gmail.com");

		System.out.println(email);

	}

}
