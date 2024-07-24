package Coolections_Java;

import java.util.ArrayList;

public class ArrayList_Prgm {

	public static void main(String[] args)
	{
		 ArrayList a1 = new ArrayList();
		 ArrayList a2 = new ArrayList();
		 a1.add("pam");
		 a1.add(23);
		 a1.add("456");
		 
		 a2.add("pam1");
		 a2.add(231);
		 a2.add("4561");
		 System.out.println( "a1 only " + a1);
		 
		 a1.addAll(a2);
		 
		 System.out.println( "a1 & a2 " + a1);
		 
		 a1.removeAll(a2);
		 
		 System.out.println("after removing a2  " + a1);
		 a1.removeAll(a1);
	}

}
