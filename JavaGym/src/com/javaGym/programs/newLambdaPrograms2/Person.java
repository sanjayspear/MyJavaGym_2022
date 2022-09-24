package com.javaGym.programs.newLambdaPrograms2;

public class Person {
	private String firstName;
	private String lastname;
	private int age;
	public Person(String firstName, String lastname, int age) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
