package Coolections_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_List2 {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		ArrayList a3 = new ArrayList();
	        	a1.add("Suraj");
				a1.add("Moon");
				a1.add("Kangaroo");
				a1.add("Ebenezer");
				System.out.println(a1);
				
				
				a2.addAll(a1);
				
				a2.add("good");
				a2.add("nice");
				System.out.println(a2);
				
				System.out.println("if contains suraj  " + a1.contains("Suraj"));
				System.out.println("if containsall a1   " + a2.containsAll(a1));
				
				 a3.addAll(a2);
				 System.out.println("a3  " + a3);
				 a3.remove(0);
				System.out.println("Index 0 removed  " + a3);
				System.out.println(a1);
				a2.removeAll(a1); //remove the entire collection
				System.out.println("a1 removed --> " + a2);
				System.out.println(a1.isEmpty());
				a3.clear(); //clears the entire array
				System.out.println("is a3 empty -->" + a3.isEmpty());
				System.out.println(a2);
				System.out.println(a2.size());
				Collections.sort(a1);
				System.out.println(a1);
				//Collections.reverseOrder();
				Collections.sort(a1,Collections.reverseOrder());
				System.out.println(a1);
				
				
	}
	

}
