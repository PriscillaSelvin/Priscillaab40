package Courseprograms;

interface Data_provider
{
	   void username();
	   
	  void password();
	   
}


public class ClassTypeCasting implements Data_provider
{
	void login_button()
	{
		System.out.println("Login-button");
	}
	 

	public static void main(String[] args)
	
	{
		 Data_provider d1 = new ClassTypeCasting();  //upcasting
		 Data_provider d2 = (Data_provider) new  ClassTypeCasting();  		 //explicit upcasting
		  d1.username();
		  d1.password();
		 d2.username();
		 d2.password();
		 ClassTypeCasting a2 = (ClassTypeCasting) d1; //downcasting explicit
		 
		// d1.Login_button()  not able to do
		 
  a2.username();
  a2.password();
  a2.login_button();
  a2.username();
  
	}


	@Override
	public void username()
	{
		// TODO Auto-generated method stub
		System.out.println("user1");
		
	}


	@Override
	public void password() 
	{
		// TODO Auto-generated method stub
		System.out.println("pwd1");
		
	}
}
 
	 


