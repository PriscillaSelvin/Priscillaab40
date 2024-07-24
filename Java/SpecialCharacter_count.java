package Coolections_Java;

public class SpecialCharacter_count {

	public static void main(String[] args)
	{
		 
		String name = "Selvin@1234^";
		int length = name.length();
		char[] a = name.toCharArray();
		int count_alpha = 0;
		int count_num = 0;
		int count_special = 0;
		
		for(int i=0;i<length-1;i++)
		{
			if (Character.isAlphabetic(a[i]) == true  )
			{
				count_alpha++;
			}
			
			if (Character.isDigit(a[i]) == true  )
			{
				count_num++;
			}
		}
		
		int count2 = count_alpha + count_num;
		count_special = length - count2;
		System.out.println("No of Special characters  " + count_special);
		
		if (length != count2 )
		{
			System.out.println("Has Special Characters ");
		}
		else
		{
		   System.out.println("No Special characters ");	
		}
	}

}
