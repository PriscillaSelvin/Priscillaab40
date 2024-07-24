package Courseprograms;

import java.util.Scanner;

public class String_Example2 {

	public static void main(String[] args) 
	
	{
		 try (Scanner scanner = new Scanner(System.in)) {
			String name = scanner.next();
			 
			 for(int i=0;i<name.length();i++)
			 {
				 char a1 = name.charAt(i);
				 System.out.println(a1);
			 }
			 for(int i=name.length()-1;i>=0;i--)
			 {
				 char a1 = name.charAt(i);
				 System.out.print(a1);
			 }
		}

	}

}
