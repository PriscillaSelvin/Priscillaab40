package Courseprograms;

import java.util.Arrays;

public class Array_Example6 {

	public static void main(String[] args) 
	{
		int roll_no[] = new int[4];
		int copy_rollno[] = new int[4];
		
		 roll_no[0] = 90;
		 roll_no[1] = 89;
		 roll_no[2] = 6;
		 roll_no[3] = 45;
		 int i = 3;
		  
		 for(int j=0; j<=roll_no.length-1;j++)
		 {
			 copy_rollno[j] = roll_no[i];			  
			 i--;
		 }
		 
		 System.out.println("the original array " + Arrays.toString(roll_no));
		 System.out.println("the reverrse array " + Arrays.toString(copy_rollno));
		
	}
	 

}
