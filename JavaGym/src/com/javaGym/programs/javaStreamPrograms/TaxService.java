package com.javaGym.programs.javaStreamPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	public static List<Emp> evaluateTaxUser(String input) {

		if (input.equalsIgnoreCase("Tax")) {
			System.out.println("Taxable Employees");
			return DataBase.getEmployees().stream().filter(e -> e.getSalary() >=200000).collect(Collectors.toList());
		} else {
			System.out.println("Non Taxable Employees");
			return DataBase.getEmployees().stream().filter(e -> e.getSalary() <200000).collect(Collectors.toList());
		}

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUser("Non Tax"));
	}
}
