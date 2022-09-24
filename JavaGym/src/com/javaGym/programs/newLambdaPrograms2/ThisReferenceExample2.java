package com.javaGym.programs.newLambdaPrograms2;

public class ThisReferenceExample2 {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		ThisReferenceExample2 thisReferenceExample = new ThisReferenceExample2();

		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);

			}
			
			@Override
			public String toString() {
				return "This is the anonymous inner class";
				
			}
		});
	}

}
