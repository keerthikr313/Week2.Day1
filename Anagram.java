package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declare a string 
		   String text1 = "stops";
		//Declare another string
		   String text2 = "potss";
		
		//a) Check length of the strings are same then (use a condition)
		   if(text1.length() == text2.length());
		
		//b) convert both strings in to characters
		   char[] text1Array = text1.toCharArray();
		   char[] text2Array = text2.toCharArray();
		
		//c) sort both the arrays
		   Arrays.sort(text1Array);
		   Arrays.sort(text2Array);
		
		//d) check both the arrays has same value
			boolean result = Arrays.equals(text1Array, text2Array);
			if (result) {
				System.out.println(text1+ "and" +text2+ "are anagram");
			}
            else {
            	System.out.println(text1+ "and" +text2+ "are not anagram");
            }
	}

}
