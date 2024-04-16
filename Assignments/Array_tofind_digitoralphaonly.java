package assignments;

import java.util.Scanner;

public class Array_tofind_digitoralphaonly {

	public static void main(String[] args) 
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = scanner.next();
		char[] a1 =  name.toCharArray();
		int length = name.length();
		
		int no_digits = isDigit_no(a1,length);
		int no_alphabets = isAlphabetic_no(a1,length);
		
		if (no_digits==length)
		{
			System.out.println("The String contains only digits  -->" +  name);
		}		
		else if (no_alphabets==length)
		{
			System.out.println("The String contains only alphabets  -->" +  name);
		}
		else
		{
			System.out.println("Contains alphanumeric  " + name);
		}
		scanner.close();
		 
	}	 
	
	public static int isDigit_no(char[] a1, int length)
	{
          int j=0;
		for(int i=0;i<length;i++)
		{
			boolean answer = Character.isDigit(a1[i]);
			 
			if (answer==true)
			{
				 j++;
			}
			
	    }
		return j;
	}
	public static int isAlphabetic_no(char[] a1, int length)
	{
	          int j=0;
			for(int i=0;i<length;i++)
			{
				boolean answer = Character.isAlphabetic(a1[i]);
				 
				if (answer==true)
				{
					 j++;
				}
				
		}
			return j;
	}

	}


