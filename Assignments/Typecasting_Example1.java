package Courseprograms;

public class Typecasting_Example1 {

	public static void main(String[] args) 
	
	{
		 double weight = 83 ;  //implicit widening
		 System.out.println(weight);
		 
		 double weight1 = (double) 83;  //explicit widening
		 System.out.println(weight1);	
		 
		 int weight2 = (int)  83.65;  //narrowing
		 System.out.println(weight2);
		 
		 double a = 90.87;
		 int b = (int) a;
		 
	}

}
