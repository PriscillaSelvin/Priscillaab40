package Courseprograms;

public class Abstract_Class2  extends Facebook_Class
{

	void modulus()
	{
		
	}
	public static void main(String[] args) {
		 

	}
	@Override
	void multiple() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void divide() {
		// TODO Auto-generated method stub
		
	}

}

abstract class Facebook_Class
{
	void add() //concrete method
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract() //concrete method
	{
		System.out.println(Math.subtractExact(20,10));
	}
	abstract void multiple(); //abstract method
	abstract void divide();  //abstract method
	
	
}
