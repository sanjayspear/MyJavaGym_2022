package com.javaGym.programs.newLambdaPrograms2;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		//Anonymous inner class
		doProcess(a, new Process() {

			@Override
			public void process(int i) {
				System.out.println(i + b);

			}

		});
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}


