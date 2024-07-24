package Courseprograms;

import java.util.InputMismatchException;

public class ExceptionHandling_Example1 {

	public static void main(String[] args) 
	{
		try
		{
			int c=1/0;
			System.out.println(c);
		}
		
		 catch(ArithmeticException s1)
		{
			 System.out.println("I have handled exception");
		}
		 catch(NullPointerException s2)
		{
			 System.out.println("I have handled exception");
		}
		 catch(InputMismatchException s3)
		{
			 System.out.println("I have handled exception");
		}
		 catch(ArrayIndexOutOfBoundsException s4)
		{
			 System.out.println("I have handled exception");
		}
		System.out.println("I am out of try and catch");

	}

}
