package com.javaGym.programs.javaStreamPrograms2;

import java.util.Comparator;
import java.util.List;

import com.javaGym.programs.javaStreamPrograms.DataBase;
import com.javaGym.programs.javaStreamPrograms.Emp;

public class SortedDemo2 {

	public static void main(String[] args) {

		List<Emp> employees = DataBase.getEmployees();
		
		//employees.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		
		//employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		//employees.stream().sorted(Comparator.comparing(Emp::getName)).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Emp::getId)).forEach(System.out::println);
	}

}
