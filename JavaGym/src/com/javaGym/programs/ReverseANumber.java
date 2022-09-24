package com.javaGym.programs;

public class ReverseANumber {

	public static void main(String[] args) {
		//==============Approach: 1=================
		
		Long num = 89768907543256777L;
		Long res=0L;
		
		while(num>0)
		{
			res=res*10+num%10;
			num=num/10;
		}
		System.out.println(res);
		
		//==============Approach: 2==================
		Long n = 89768907543256777L;
		
        String s = n.toString();
		
		for(int i=s.length()-1; i>=0 ; i--) {
			char ch = s.charAt(i);
			int number = Character.getNumericValue(ch);
			System.out.print(number);
		}

	}

}
