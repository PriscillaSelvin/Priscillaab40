package Courseprograms;

public class Array_example4 {

	public static void main(String[] args) 
	
	{ 
		int roll_no[] = new int[4];
	
		 roll_no[0] = 90;
		 roll_no[1] = 89;
		 roll_no[2] = 6;
		 roll_no[3] = 45;
		 int number_to_check = 6;
		 
		 for(int i=0;i<roll_no.length;i++)
		 {
			 if(number_to_check == roll_no[i])
			 {
				 System.out.println("the number " + number_to_check + " is present");
				 break;
			 }
			 
		 }
		 System.out.println("the number " + number_to_check + " is not present");

	}

}
