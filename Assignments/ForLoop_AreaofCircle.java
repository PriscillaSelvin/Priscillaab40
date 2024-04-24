package Loops;
//Program to find the area of the circle for 10 different inputs
import java.util.Scanner;

public class ForLoop_AreaofCircle
{
    final static double  pi = 3.14;
	
    public static void main(String[] args) 
	{   
		int radius = 0;
	    double area = 0.0;
	    Scanner S1 = new Scanner(System.in);
	    
        for(int i=1;i<=10;i++)
        {
		 
		System.out.println("Enter the radius" + i);
		radius = S1.nextInt();
		area = (pi) * (radius * radius);		
		System.out.println("The area of circle-" + i + " " + area); 
		System.out.println("**********");
		
        }
       S1.close();
	}

}

