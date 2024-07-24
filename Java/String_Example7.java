package Courseprograms;



public class String_Example7 {

	public static void main(String[] args) 
	{
		String name = "Ma3nish123 $# Kumar";
		char[] a1 =  name.toCharArray();
		
		int no_digits = isDigit_no(a1,name);
		int no_alphabets = isAlphabetic_no(a1,name);
		int no_spaces = isSpace_no(a1,name);
		
		int no_specialchars = name.length() - (no_digits + no_alphabets + no_spaces);
		System.out.println("The string --> " + name);
		System.out.println("The length of the string '" + name + "' is  " + name.length());
		System.out.println("No of Digits  -->  " + no_digits);
		System.out.println("No of Alphabets  -->  " + no_alphabets);
		System.out.println("No of Spaces  -->  " + no_spaces);
		System.out.println("No of Specialcharacters  -->  " + no_specialchars);
	}	 
	
	public static int isDigit_no(char[] a1, String name)
	{
          int j=0;
		for(int i=0;i<name.length();i++)
		{
			boolean answer = Character.isDigit(a1[i]);
			 
			if (answer==true)
			{
				 j++;
			}
			
	    }
		return j;
	}
	public static int isAlphabetic_no(char[] a1, String name)
	{
	          int j=0;
			for(int i=0;i<name.length();i++)
			{
				boolean answer = Character.isAlphabetic(a1[i]);
				 
				if (answer==true)
				{
					 j++;
				}
				
		}
			return j;
	}
	public static int isSpace_no(char[] a1, String name)
	{
		          int j=0;
				for(int i=0;i<name.length();i++)
				{
					boolean answer = Character.isSpaceChar(a1[i]);
					 
					if (answer==true)
					{
						 j++;
					}					
			}	
				return j;
     }
		
}  //class
		
