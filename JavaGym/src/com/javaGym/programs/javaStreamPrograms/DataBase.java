package com.javaGym.programs.javaStreamPrograms;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	public static List<Emp> getEmployees(){
		
	List<Emp> emp= new ArrayList<>();

	emp.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 300000));
	emp.add(new Emp(122, "Paul Nikusi", 25, "Male", "Sales And Marketing", 2015, 300000));
	emp.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 500000));
	emp.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 250000));
	emp.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 280000));
	emp.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 180000));
	emp.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 600000));
	emp.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 650000));
	emp.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 950000));
	emp.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 1100000));
	emp.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 750000));
	emp.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 600000));
	emp.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 300000));
	emp.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 350000));
	emp.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 400000));
	emp.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 550000));
	emp.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 650000));
	
	return emp;
	}
}
