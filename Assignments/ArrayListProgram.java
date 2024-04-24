package Coolections_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args)
	
	{
		List list =  new ArrayList();  //upcasting to know the behavior of list interface
		
		list.add(12);
		list.add("Manoba");
		list.add(90.87);
		list.add(7865);
		list.add(null);
		list.add(null);
		list.add(12);
		list.add("Manoba");
		Collections.sort(list);
		System.out.println(list);
		

	}

}
