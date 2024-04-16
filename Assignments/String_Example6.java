package Courseprograms;

import java.util.Scanner;

public class String_Example6 
{

	public static void main(String[] args) 
	{
		String name = "I am student";
		String output = name.replace('a',' ');
		String output1 = name.replace('a','n');
		System.out.println(output1);
		System.out.println(output);
		System.out.println(name.replaceAll(("[A-Z]"), " "));
		System.out.println(name.replaceAll(("[a-z]"), " "));
		String name1 = "Hi 7 I am Fin9";
		System.out.println(name1.replaceAll(("[0-9]"), " "));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String input = scanner.next();
		System.out.println(input.replaceAll(("[A-Z]"), "Manish "));
		String name3 = " ";
		System.out.println(name3.isEmpty());
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.equalsIgnoreCase("i am student"));
		System.out.println(name.repeat(5));
		System.out.println();

	}

}
