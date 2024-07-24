package assignments;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Array_Try_Catch_Finally {

	public static void main(String[] args)
	
	{
		int j =10;
		int [] num_array = new int[5];
		
		try
		{
			
			for (int i=0;i<=5;i++)
			{
				num_array[i] = j;
				j=j+10;
			}
					
			 
		}
		
		 catch(ArithmeticException s1)
		{
			 System.out.println("I have handled Arithmetic exception");
		}
		 catch(NullPointerException s2)
		{
			 System.out.println("I have handled NullPointerException exception");
		}
		 catch(InputMismatchException s3)
		{
			 System.out.println("I have handled InputMismatch exception");
		}
		 catch(ArrayIndexOutOfBoundsException s4)
		{
			 System.out.println("I have handled ArrayIndexoutofbounds exception");
		}
		 
		finally
		{
			System.out.println("Finally values stored in the Array" + Arrays.toString(num_array));
		}

	


	}

}
