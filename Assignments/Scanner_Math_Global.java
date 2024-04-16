package assignments;

import java.util.Scanner;

public class Scanner_Math_Global {
	
	final static Scanner S1 = new Scanner(System.in);
	static int n1 = 0;
	static int n2 = 0;
	static int result = 0;

	public static void main(String[] args) 
	{
		 
		System.out.println("Enter the number1");
		n1 = S1.nextInt();
		System.out.println("Enter the number1");
		n2 = S1.nextInt();
		add();
		sub();
		mul();
		div();
		mod();
		S1.close();

	}
	
	static void add()
    {
       	System.out.println("***Addition*******");
		result = n1 + n2;
		System.out.println("*****" + n1 + "+" + n2 + "=" + result );
	}
    static void sub()
    {
    	 
    	System.out.println("***Subtraction*******");
		result = n1 - n2;
		System.out.println("*****" + n1 + "-" + n2 + "=" + result );
		 
	}    
    static void mul()
      {
    	    System.out.println("***Multiplication*******");
    		result = n1 * n2;
    		System.out.println("*****" + n1 + "*" + n2 + "=" + result );
      }
    static void div()
    {
  	    System.out.println("***Division*******");
  		double result = n1 / n2;
  		System.out.println("*****" + n1 + "/" + n2 + "=" + result );
  	}
    
    static void mod()
    {
  	    System.out.println("***Modulus*******");
  		result = n1 % n2;
  		System.out.println("*****" + n1 + "Mod" + n2 + "=" + result );  		  
  	}
     

}
