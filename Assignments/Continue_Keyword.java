package Courseprograms;

public class Continue_Keyword {

	public static void main(String[] args)
	{
		for (int i=0;i<6;i++)
			
		{
			if (i==4)
			{
				continue;
			}
			System.out.println("My age is " + i);
		}
		
		int j = 0;
		while (j < 10) {
		  if (j == 4) {
		    j++;
		    continue;
		  }
		  System.out.println(j);
		  j++;
		}

	}

}
