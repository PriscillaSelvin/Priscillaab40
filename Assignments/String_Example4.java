package Courseprograms;

import java.util.Date;

public class String_Example4 {

	public static void main(String[] args) 
	
	{
		
		 Date d1 = new Date();
		 System.out.println(d1.getTime()); //epoch
		 Date d2 = new Date(d1.getTime());
		 Date d3 = new Date(d1.getTime()-(1000*60*60*24*1)); //past
		 Date d4 = new Date(d1.getTime() + (1000*60*60*24*5)); //future
		 System.out.println(d2);
		 String future_time = d4.toString();
	     System.out.println("futuretime" + future_time);
	     System.out.println(d3);
	     System.out.println(d4);
	     String month = future_time.substring(4,7);
	     String date = future_time.substring(8,10);
	     String year = future_time.substring(future_time.length()-5);
	     System.out.println(month);
	     System.out.println(date);
	     System.out.println(year);
	     System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
	     System.out.println(month.concat("/ ").concat(date).concat("/ ").concat(year));
	     
	}

}
