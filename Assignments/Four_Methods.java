package assignments;

 
public class Four_Methods {

	 
	public static void main(String[] args)
	{
		 add(20,50);
		
		 sub(120,40);
		 
		 mul(30,12);
		 
		 div(110,5);		 

	}
	
    static void add(int n1, int n2)
    {
    	 
		int result = n1 + n2;		
		System.out.println("*****" + n1 + "+" + n2 + "=" + result );
			  
      }
    static void sub(int n1, int n2)
    {
    	int result = n1 - n2;		
		System.out.println("*****" + n1 + "-" + n2 + "=" + result );
		 
	}
    
    static void mul(int n1, int n2)
      {
    	   	 
    		int result = n1 * n2;   		
    		System.out.println("*****" + n1 + "*" + n2 + "=" + result );    	 
    	
      }
    static void div(int n1,int n2)
    {
  	   	 
  		int result = n1 / n2;  		
  		System.out.println("*****" + n1 + "/" + n2 + "=" + result );
	}
    
   }
