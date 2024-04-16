package assignments;
abstract class GrandParent_Abstract
{
	 
	abstract void cars(); 
	abstract void trucks();  
	
	void bus()
	{
		System.out.println("This is concrete method with name bus in GrandParent");
	}
}  //class GrandPArent_Abstract

abstract class Parent_Abstract extends GrandParent_Abstract
{
	 
	abstract void toyota();  
	abstract void mitsubhishi();   
		
}  //class PArent_Abstract

public class Abstract_child extends Parent_Abstract{

	 void speed ()
	 {
		System.out.println(" This is child and speed of the vehicle");
		
	 }
    static void fuelefficiency()
     {
    	System.out.println("This is child and fuelefficiency of the vehicle");
 
     }

	public static void main(String[] args) 
	{
		Abstract_child abschild = new Abstract_child();
		abschild.bus();
		abschild.trucks();
		abschild.cars();
		abschild.toyota();
		abschild.mitsubhishi();
		abschild.speed();
		fuelefficiency();
		
	}  //main
	
	@Override
	void toyota() 
	{
		 
		System.out.println("this is PArent and method name Toyota");
	}
	@Override
	void mitsubhishi() 
	{
		 System.out.println("This is PArent and method name mitsubhishi");
		
	}
	@Override
	void cars() 
	{
		 System.out.println("This is GrandParent and method name cars");
		
	}
	@Override
	void trucks()
	{
		 System.out.println("this is GrandParent and method name trucks");
		
	}

} // class Abstract_Child
