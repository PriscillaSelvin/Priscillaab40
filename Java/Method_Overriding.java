package Courseprograms;
class Parent_Class
{
	void add()
	{
	  System.out.println("Parent");
	}
}

public class Method_Overriding extends Parent_Class

{void add()
	{
	  super.add();
	  System.out.println("child");
	}

	public static void main(String[] args)
	{
		
		 Method_Overriding M_O = new Method_Overriding();
		 M_O.add();

	}

}
