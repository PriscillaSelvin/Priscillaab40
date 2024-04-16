package Courseprograms;

class login
{
	private String email_id = "contact@grotechminds.com";
	
	public String getEmail_id()
	{
		return email_id; // toretrive the data set to the global variable
	}
	
	public void setEmail_id(String email_id)
	{
		this.email_id = email_id;
	}
	private String password="contact23*";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation_example1 {

	public static void main(String[] args) 
	
	{
		login l1 = new login();
		
		l1.setEmail_id("vijay@gmail.com ");
        System.out.println(l1.getEmail_id());
        l1.setPassword("vijaypwd23");
		System.out.println(l1.getPassword());
		l1.setAge(24);
		System.out.println(l1.getAge()); 
	}

}
