package Courseprograms;

import java.util.Scanner;

public class Input_Scanner 
{

	public static void main(String[] args) 
	{
		 
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = S1.next();
		System.out.println(name);
		S1.close();
		

	}

}
