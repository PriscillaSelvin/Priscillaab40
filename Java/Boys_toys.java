package Courseprograms;

public class Boys_toys {

	public static void main(String[] args)
	{
		 String input = "A1B2C3D4E5F6";
		 
		 int length = input.length();
		 int j=0;
		 
		 for (int i=0;i<=length-1;i++)
		 {
			 if(Character.isDigit(input.charAt(i)) == true)
					 {
				         j++;
					 }
		 }
		 
		 System.out.println("No of toys  " + j);

	}

}
