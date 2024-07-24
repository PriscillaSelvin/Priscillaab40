package Courseprograms;

import java.util.Arrays;

public class Array_Example1 {

	public static void main(String[] args)
	{
		 int age[] = {5, 8, 9};
				// new int[3];
		 age[0] = 19;
		 age[1] = 90;
		 age[2] = 5;
		 for(int i=0; i<3; i++)
		 {
		 System.out.println(age[i]);
		 }
		 System.out.println(Arrays.toString(age));
		 String a1 = "Manish";
		 char[] value = a1.toCharArray();
		 System.out.println(Arrays.toString(value));
	}

}
