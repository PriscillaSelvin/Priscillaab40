package Courseprograms;

import java.util.Arrays;

public class Array_Example2 {

	public static void main(String[] args) {
		 int number[] = new int[3];
		 int number2[] = new int[3];
		 number[0] = 90;
		 number[1] = 70;
		 number[2] = 60;
		 number2[0] = 45;
		 number2[1] = 67;
		 number2[2] = 89;
		 
		 boolean answer = Arrays.equals(number, number2);
		 System.out.println(answer);
		 

	}

}
