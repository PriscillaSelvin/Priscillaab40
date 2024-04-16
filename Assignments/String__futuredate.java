package assignments;

import java.util.Date;

public class String__futuredate {

	public static void main(String[] args)
	{

        Date D1 = new Date();
        Date D2 = new Date(D1.getTime());
        Date D3 = new Date(D1.getTime() + (1000*60*60*24*10));
        
        System.out.println("Todays date  -->  " );
        System.out.println(D2);
        
        System.out.println("The date after 10 days -->");
        System.out.println(D3);

	}

}
