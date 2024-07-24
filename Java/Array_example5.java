package Courseprograms;

import java.util.Arrays;

public class Array_example5 {

	public static void main(String[] args) 
	
	{
		int roll_no[] = new int[4];
		int copy_rollno[] = new int[4];
		
		 roll_no[0] = 90;
		 roll_no[1] = 89;
		 roll_no[2] = 6;
		 roll_no[3] = 45;
		 for(int i=0; i<roll_no.length;i++)
		 {
			 copy_rollno[i] = roll_no[i];
		 }
		   System.out.println("The original Array " + Arrays.toString( roll_no));	  
   System.out.println("the copied array " +  Arrays.toString(copy_rollno));

	}

}
