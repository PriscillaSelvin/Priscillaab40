package assignments;

class Parent5
{
	long Property5;
	
	Parent5()
	{
		Property5 = 200000;
	}
}
class Parent4 extends Parent5
{
	long Property4;
	
	Parent4()
	{
		super();
	 Property4 = 250000;
	}
}
class Parent3 extends Parent4
{
	long Property3;
	
	Parent3()
	{
		Property3 = 250000;
	}
}
class Parent2 extends Parent3
{
	long Property2;
	Parent2()
	{
		Property2 = 250000;
	}
}
public class Multilevel_Inheritance extends Parent2
{
	static long finalproperty = 800000;

	public static void main(String[] args)
	{
		 Parent5 No5 = new Parent5();
		 Parent4 No4 = new Parent4();
		 Parent3 No3 = new Parent3();
		 Parent2 No2 = new Parent2();
		 Multilevel_Inheritance Result = new Multilevel_Inheritance();
		 System.out.println("the intial property value " + No5.Property5);	 
		 System.out.println("the second property value " + (No4.Property5 + No4.Property4));
		 System.out.println("the thrid property value " + (No3.Property5 + No3.Property4 + No3.Property3));
		 System.out.println("the fourth property value " + (No2.Property5 + No2.Property4 + No2.Property3 + No2.Property2));
		 System.out.println("the final property value " + (finalproperty + Result.Property5 + Result.Property4 + Result.Property3 + Result.Property2));

	}

}
