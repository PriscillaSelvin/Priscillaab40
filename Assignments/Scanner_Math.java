package assignments;

import java.util.Scanner;

public class Scanner_Math {

	public static void main(String[] args)
	{
		 add();
		
		 sub();
		 
		 mul();
		 
		 div();
		 
		 mod();

	}
	
    static void add()
    {
    	Scanner S1 = new Scanner(System.in);
    	System.out.println("***Addition*******");
		System.out.println("Enter the number1");
		int n1 = S1.nextInt();
		System.out.println("Enter the number2");
		int n2 = S1.nextInt();
		int result = n1 + n2;
		
		System.out.println("*****" + n1 + "+" + n2 + "=" + result );
		 
		 
		 
	  
      }
    static void sub()
    {
    	Scanner S1 = new Scanner(System.in);
    	System.out.println("***Subtraction*******");
		System.out.println("Enter the number1");
		int n1 = S1.nextInt();
		System.out.println("Enter the number2");
		int n2 = S1.nextInt();
		int result = n1 - n2;
		
		System.out.println("*****" + n1 + "-" + n2 + "=" + result );
		 
		 
	  
      }
    
    static void mul()
      {
    	   	Scanner S1 = new Scanner(System.in);
    	   	System.out.println("***Multiplication*******");
    		System.out.println("Enter the number1");
    		int n1 = S1.nextInt();
    		System.out.println("Enter the number2");
    		int n2 = S1.nextInt();
    		int result = n1 * n2;
    		
    		System.out.println("*****" + n1 + "*" + n2 + "=" + result );
    		 
    		 
    	
      }
    static void div()
    {
  	   	Scanner S1 = new Scanner(System.in);
  	  System.out.println("***Division*******");
  		System.out.println("Enter the number1");
  		int n1 = S1.nextInt();
  		System.out.println("Enter the number2");
  		int n2 = S1.nextInt();
  		int result = n1 / n2;
  		
  		System.out.println("*****" + n1 + "/" + n2 + "=" + result );
  		 
    }
    
    static int mod()
    {
  	   	Scanner S1 = new Scanner(System.in);
  	    System.out.println("***Modulus*******");
  		System.out.println("Enter the number1");
  		int n1 = S1.nextInt();
  		System.out.println("Enter the number2");
  		int n2 = S1.nextInt();
  		int result = n1 % n2;
  		
  		System.out.println("*****" + n1 + "Mod" + n2 + "=" + result );  		  
  		return result;
  	
    }
    
}
