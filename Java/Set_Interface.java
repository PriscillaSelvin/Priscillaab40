package Coolections_Java;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) 
	{
		 Set s1 = new TreeSet();  //to know the behaviour of SET interface
		 s1.add(1234);
		 s1.add(4567);
		 s1.add(23);
		 s1.add(23);
		 s1.add(23);
		 s1.add(23);
		 s1.add(2345);
		// s1.add(null);
		 System.out.println(s1);
         Iterator iterator = s1.iterator();
		 
		 while(iterator.hasNext()==true)
		 {
			 System.out.println(iterator.next());
		 }
		 
		 /* ListIterator i2 = s1.listIterator();
		 
		 while(i2.hasNext()==true)
		 {
			 System.out.println(i2.next());
		 }
		 while(i2.hasPrevious()==true)
		 {
			 System.out.println(i2.previous()); //backward
		 } */
	}

}
