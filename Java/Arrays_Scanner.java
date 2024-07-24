package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Scanner {

	public static void main(String[] args)
	
	{
		 
		 int number[] = new int[5];
		 Scanner scanner = new Scanner(System.in);
		 int getnum = 0;
		 for(int i=0; i<number.length; i++)
		 {
			 System.out.println("Enter the number  ");
			 getnum = scanner.nextInt();
			 number[i] = getnum;
		 }
		 scanner.close();
		 System.out.println(Arrays.toString(number));
	}

}
