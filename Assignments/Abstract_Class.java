package Courseprograms;
abstract class Google_Code
{
	abstract void login();
	abstract void registration();
}
public class Abstract_Class extends Google_Code
{

	public static void main(String[] args)
	
	{
		 
       Abstract_Class ABClass = new Abstract_Class();
       ABClass.login();
	}

	@Override
	void login() 
	{
		 System.out.println("Login Logic");
	}

	@Override
	void registration() 
	{
		System.out.println("registration Logic");
		
	}

}
