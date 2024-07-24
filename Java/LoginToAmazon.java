package Courseprograms;
class Dataprovider
{
	  void username()
	  {
		  
	  }
	  void password()
	  {
		  
	  }
}


public class LoginToAmazon extends Dataprovider{
	void login_button()
	{
		
	}

	public static void main(String[] args)
	
	{
		 Dataprovider d1 = new LoginToAmazon();  //upcasting
		 Dataprovider d2 = (Dataprovider) new LoginToAmazon(); //explicit upcasting
		 d1.username();
		 d1.password();
		 LoginToAmazon a2 = (LoginToAmazon)  d1; //downcasting explicit
		 
		// d1.Login_button()  not able to do
		 
  a2.username();
  a2.password();
  a2.login_button();
  
	}

}
