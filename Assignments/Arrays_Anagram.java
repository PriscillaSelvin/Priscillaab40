package Courseprograms;

import java.util.Arrays;

public class Arrays_Anagram {

	public static void main(String[] args) 
	{
		 String name1 = "horse";
		 String name2 = "shore";
		 char[] name1_char =name1.toCharArray();
		 
		 char[] name2_char =name2.toCharArray();
		 Arrays.sort(name1_char);
		 
		 Arrays.sort(name2_char);
		 if (Arrays.equals(name1_char, name2_char))
		 {
			 System.out.println("the strings are Anagram");
		 }
		 else
		 {
			 System.out.println("the strings are not Anagram"); 
		 }
	}

}
