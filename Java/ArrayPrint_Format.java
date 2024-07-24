package assignments;

import java.util.Arrays;

public class ArrayPrint_Format {

	public static void main(String[] args) 
	{
		String[] rollno= new String [5];
		String[] name = new String[5];
		String[] gender = new String[5];
		String[] mobileno = new String[5];
		String print_name = " ";
		String print_gender = " ";
		String print_mobileno = " ";
		String print_rollno = " ";
		
		//int c =0;
		//String h = value.toString(c);
		
		rollno[0] = "1";
		rollno[1] = "2";
		rollno[2] = "3";
		rollno[3] = "4";
		rollno[4] = "5";
				 
		name[0] = "Kushal" ;				
		name[1] = "Kushal P";
		name[2] = "Vishal Prasad";
		name[3] = "Monica Rawat" ;
		name[4] = "Kushagra Verma" ;
		
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
		
		for(int i=0;i<5;i++)
		{
			 print_name = print_name.concat(name[i] + "\t") ;
			 print_gender = print_gender.concat( gender[i] + "  \t\t");
			 print_mobileno = print_mobileno.concat((mobileno[i]) + "  \t");
			print_rollno = print_rollno.concat(  rollno[i] + "\t\t");		
			 
		}
		System.out.println("Student\t" + print_name);
		System.out.println("Gender\t" + print_gender);
		System.out.println("MobileNo" + print_mobileno);
		System.out.println("RollNo\t" + print_rollno);
		
		 
		}
	}


