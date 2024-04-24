package Loops;
//Program to print the values that are divisble by 5 from 1 to 100

public class ForLoop_Divisbleby5 {

	public static void main(String[] args)
	{
		 for(int i=1; i<=100; i++)
		 {
			 if(i%5 == 0)
			 {
				 System.out.println(i);
			 }
		 }
	}

}
