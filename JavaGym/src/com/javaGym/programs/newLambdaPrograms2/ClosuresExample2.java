package com.javaGym.programs.newLambdaPrograms2;

public class ClosuresExample2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		//Anonymous inner class
		doProcess(a, i -> System.out.println(i + b));
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	public abstract void process(int i);
}


