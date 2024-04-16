package Courseprograms;
class GrandParent3
{
	void add()
	{
		
	}
	
}

class ParentClass3 extends GrandParent3
{
	void sub()
	{
		
	}
}

public class ChildClass3 extends ParentClass3 
{
	void mul()
	{
		
	}

	public static void main(String[] args)
	
	{
		ParentClass3 p1 = new ChildClass3();  //upcasting
		p1.add();
		p1.sub();

	}

}
