package Loops;
// Program to print both even and odd numbers
public class ForLoop_EvenOdd {

	public static void main(String[] args)
	{
		System.out.println("EVEN  " + "  ODD");
		System.out.println("********************************");
		 for(int i=1;i<=100;i++)
		 {
			 if (i%2 == 0)
			 {
				 System.out.println(i + "   |");
			 }
			 else
			 {
				 System.out.println("     |    "+ i);
			 }
		 }

	}

}
