package com.javaGym.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersUsingHashMap {

	public static void main(String[] args) {
       String s="Welcome to java";
       s.toCharArray();
       
       Map<Character, Integer> hm = new HashMap<>();
       
       for(int i=0; i<s.length(); i++)
       {
    	   if(!hm.containsKey(s.charAt(i)))
    	   {
    		   hm.put(s.charAt(i), 1);
    	   }
    	   else
    	   {
    		   hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
    	   }
       }
       for(Map.Entry<Character, Integer> e : hm.entrySet())
       {
    	   if(e.getValue()>=1)
    	   {
    		   System.out.println(e.getKey()+"===>"+e.getValue());
    	   }
       }
	}

}
