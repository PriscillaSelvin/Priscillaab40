package Courseprograms;

public class Throws_Example {

	public static void main(String[] args) throws InterruptedException  
	{
		Thread.sleep(2000);
		 // throw new NullPointerException();
		 int c = 1/0;
		 System.out.println("throws example");
		// throw new NullPointerException("sorry your file is empty");
		 throw new ArithmeticException("AE");
		 
	}

}
