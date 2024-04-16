package assignments;

import java.util.Arrays;

public class ArrayPrint_Format2 {

	public static void main(String[] args) 
	
	{
		String[] rollno= new String [5];
		String[] name = new String[5];
		String[] gender = new String[5];
		String[] mobileno = new String[5];
		 
		
		rollno[0] = "1";
		rollno[1] = "2";
		rollno[2] = "3";
		rollno[3] = "4";
		rollno[4] = "5";
				 
		name[0] = "Kushal" ;				
		name[1] = "Kushal P";
		name[2] = "VishalPrasad";
		name[3] = "MonicaRawat" ;
		name[4] = "KushagraVerma" ;
		
		gender[0] = "M";
		gender[1] = "M";
		gender[2] = "M";
		gender[3] = "F";
		gender[4] = "M";
		
		mobileno[0] = "968574";
		mobileno[1] = "857412";
		mobileno[2] = "857421";
		mobileno[3] = "968521";
		mobileno[4] = "967452";
		
		  
		
		System.out.println("Student \t" +   "Gender \t" + "MobileNo \t" + "RollNo" );
		
		for(int i=0;i<5;i++)
		{
			 
			System.out.println (name[i] +"  " +  "\t" + gender[i] + "\t" + (mobileno[i]) + "\t\t" + rollno[i]) ;
			  	
			 
		}
		
		
	}

}
