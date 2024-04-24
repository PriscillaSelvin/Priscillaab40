package Courseprograms;

class Data_provider
{
	  void username()
	  {
		System.out.println("username");  
	  }
	  void password()
	  {
		  System.out.println("password");
	  }
}


public class ClassTypeCasting extends Data_provider
{
	void login_button()
	{
		System.out.println("Login-button");
	}
	void username()
	  {
		System.out.println("username1");  
	  }
	  void password()
	  {
		  System.out.println("password1");
	  }

	public static void main(String[] args)
	
	{
		 Data_provider d1 = new ClassTypeCasting();  //upcasting
		 Data_provider d2 = (Data_provider) new  ClassTypeCasting();; //explicit upcasting
		 d2.username();
		 d2.password();
		 ClassTypeCasting a2 = (ClassTypeCasting) d1; //downcasting explicit
		 
		// d1.Login_button()  not able to do
		 
  a2.username();
  a2.password();
  a2.login_button();
  a2.username();
  
	}
}
 
	 


