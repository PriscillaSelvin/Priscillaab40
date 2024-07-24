package Coolections_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) 
	
	{
		 ArrayList a1 = new ArrayList();
		 
		 a1.add("8765");
		 a1.add(321);
		 a1.add("Raju");
		 a1.add("Sun");
		 a1.add("Moon");
		 
		 Iterator iterator = a1.iterator();
		 
		 while(iterator.hasNext()==true)
		 {
			 System.out.println(iterator.next());
		 }
		 
		 ListIterator i2 = a1.listIterator();
		 
		 while(i2.hasNext()==true)
		 {
			 System.out.println(i2.next());
		 }
		 while(i2.hasPrevious()==true)
		 {
			 System.out.println(i2.previous()); //backward
		 }
		 
	}

}
