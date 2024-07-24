package Courseprograms;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ener a String");
	    String input = scanner.next();
	    String output = "";
	 
	 
	 for(int i=input.length()-1;i>=0;i--)
	 {
		 char a = input.charAt(i);
		 output = output+a;
		 
	 }
	    
	 
       if (input.equalsIgnoreCase(output))
       {
    	   System.out.println("Palindrome");
       }
       else
       {
    	   System.out.println("not Palindrome");
       }
       scanner.close();
	}
	

}
