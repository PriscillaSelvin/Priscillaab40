package seleniumTopics;

public class String_Buffer {

	public static void main(String[] args)
	{
		 StringBuffer s1 = new StringBuffer();
		 StringBuffer s2 = new StringBuffer("Automation batch 40");
		 StringBuffer s3 = new StringBuffer(40);
		 s2.append("GroTechMinds");
		 System.out.println(s2);
		 s2.insert(19, "by");
		 //s2.replace(0, 0, null)
		 System.out.println(s2.reverse());
		 System.out.println(s2);
	}

}
