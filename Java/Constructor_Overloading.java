package Courseprograms;

public class Constructor_Overloading 

{
	Constructor_Overloading(int a)
	{
		System.out.println("Constructor 1 with parameter int and value passed -->  " + a);
	}
	Constructor_Overloading(char a)
	{
		System.out.println("Constructor2  with parameter char and value passed --> " + a);
	}
	Constructor_Overloading(String a)
	{
		System.out.println("Constructor3  with parameter String and value passed -->  " + a);
	}
	Constructor_Overloading(boolean a)
	{
		System.out.println("Constructor4  with parameter boolean and value passed --> " + a);
	}
	Constructor_Overloading(char a,boolean b, String c)
	{
		System.out.println("Constructor5  with 3 parameters and value passed -->  " + a +"  " + b + " " + c);
	}
	public static void main(String[] args) 
	
	{
		 
		 
       Constructor_Overloading C1 = new Constructor_Overloading(2);
       Constructor_Overloading C2 = new Constructor_Overloading('A');
       Constructor_Overloading C3 = new Constructor_Overloading("Constructors");
       Constructor_Overloading C4 = new Constructor_Overloading(true);
       Constructor_Overloading C5 = new Constructor_Overloading('A', true , "Constructors");
       
	}

}
