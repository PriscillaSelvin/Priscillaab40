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
		 
		 String g = "GRO TECH MINDS";
		 String firstword = g.substring(0,3);
		 String secondword = g.substring(4,8);
		 String thirdword = g.substring(9,14);
		 firstword = reverse(firstword);
		 secondword = reverse(secondword);
		 thirdword = reverse(thirdword);
		 System.out.println(firstword.concat(" ").concat(secondword).concat(" ").concat(thirdword));
		 System.out.println(g.split(" "));
		  
	}
	   static String reverse(String s1)
	   {
		   String output = "";
		   for (int i=s1.length()-1; i>=0; i--)
		   {
			   output = output + s1.charAt(i);
		   }
		   return output;
	   }

}
