package assignments;

import java.util.Scanner;

public class SwitchCase_Demo {

	public static void main(String[] args)
	{
	 	Scanner S1 = new Scanner(System.in);
  	    System.out.println("**********");
  		System.out.println("Enter the number from 1 to 10  in numerals");
  		int n1 = S1.nextInt();
  		switch(n1)
  		{
  		case 1 :
  			System.out.println(n1 + " -->ONE"); break;
  			
  		case 2 :
  			System.out.println(n1 + " -->TWO");break;
  		case 3 :
  			System.out.println(n1 + " -->THREE");break;
  		case 4 :
  			System.out.println(n1 + " --> Four");break;
  		case 5 :
  			System.out.println(n1 + " --> Five");break;
  		case 6 :
  			System.out.println(n1 + " --> SIX");break;
  		case 7 :
  			System.out.println(n1 + " --> SEVEN");break;
  		case 8 :
  			System.out.println(n1 + " --> EIGHT");break;
  		case 9 :
  			System.out.println(n1 + " --> NINE");break;
  		case 10 :
  			System.out.println(n1 + " --> TEN");break;
  		default :
  			System.out.println("invalid input Please enter from 1 to 10 ");
  			
  	}
  S1.close();
}
}