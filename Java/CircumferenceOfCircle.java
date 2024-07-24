package assignments;

import java.util.Scanner;

public class CircumferenceOfCircle 
{
	final static double pi = 3.14;

	public static void main(String[] args)
	
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println(" Enter the radius");
		int radius = S1.nextInt();
		int circumference_int = (2* ((int)pi) * radius  );
		double circumference_double = (2* (pi) * radius  );		
		System.out.println("The Circumference of circle in integer  :" + circumference_int); 
		System.out.println("The Circumference of circle in double   :" + circumference_double); 
        S1.close();
	}

}
