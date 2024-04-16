package assignments;

import java.util.Scanner;

public class Number_divisible {

	public static void main(String[] args) 
	
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int input = scanner.nextInt();
		 
		 if (input % 3 == 0)
		 {
			 if (input % 5 == 0)
			 {
			 System.out.println("frog and cat");
		     }
			 else
			 {
				 System.out.println("frog");
			 }
		 }
		 else if (input % 5 ==0)
		 {
			 System.out.println("cat");
		 }
		 else
		 {
			 System.out.println("not divisble by 5 or 3"); 
		 }
	
	scanner.close();
	}
}
