package assignments;

import java.util.Scanner;

public class AreaOfCircle {
	final static double pi = 3.14;

	public static void main(String[] args)
	
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println(" Enter the radius");
		int radius = S1.nextInt();
		int areainint = ((int)pi * radius * radius);
		double areaindouble = (pi) * (radius * radius);		
		System.out.println("The area of circle in integer" + areainint); 
		System.out.println("The area of circle in double" + areaindouble); 
     }
	   
    }
