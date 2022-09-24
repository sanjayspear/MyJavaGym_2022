package com.javaGym.programs;

public class CountTheNumberOfEvenAndOddCount2 {

	public static void main(String[] args) {
		// Count the number of odd number and even number

				Integer num = 54321687;

				String s = num.toString();
				
				int evenCount = 0;
				int oddCount = 0;

				for (int i = 0; i < s.length() - 1; i++) {
					char ch = s.charAt(i);
					int val = Character.getNumericValue(ch);
					
					if(val % 2 == 0) {
						System.out.println("Even :: "+val);
						evenCount++;
					}else {
						System.out.println("Odd :: "+val);
						oddCount++;
					}
				}
				
				System.out.println("============================================");
				System.out.println("Total Even Number Count :: "+evenCount+"\n");
				
				System.out.println("Total Even Number Count :: "+oddCount);
				System.out.println("============================================");

	}

}
