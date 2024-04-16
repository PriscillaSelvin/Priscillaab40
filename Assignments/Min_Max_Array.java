package assignments;

import java.util.Arrays;

public class Min_Max_Array {

	public static void main(String[] args) 
	{
		 int[] input = new int[5];
		 input[0] = 3456;
		 input[1] = 34;
		 input[2] = 345;
		 input[3] = 300;
		 input[4] = 3;
		 int Max = input[0];
		 int Min = input[0];
		 
		 for(int i=0;i<5;i++)
		 {
			 
			if ( Max  < input[i])
			 {
				 Max = input[i];
				 	 
				 
			 } 
			 
			 if (Min > input[i])
			  {
				  Min = input[i];
				   
			  }
		 }
		 System.out.println(Max);
		 System.out.println(Min);
      Arrays.sort(input);
      System.out.println("Max" + input[4]);
      System.out.println("Min" + input[0]);
	}

}
