package Strings;

import java.util.Arrays;

public class String_Char {

	public static void main(String[] args) {
		// Write a java program to check to total no of char
		String str = "AutomationTesting";
		char[] Chr = str.toCharArray();
		System.out.println("The list of char are "+Arrays.toString(Chr));
		int leng = Chr.length;
		System.out.println("The total number of char ar " + leng);
		String_Char.index(args);
		String_Char.Lexo(args);
		String_Char.mainconcat(args);

	}

	// Program 2 for get char in the given index
	public static void index(String[] args) {
		String str = new String();
		str = "Automation Testing";
		char[] sr = str.toCharArray();
		System.out.println(sr[6]);
	}

	// Comparing 2 Strings lexographically
	public static void Lexo(String[] args) {
			String str1="AutomationTesting";
			String str2="Automation";
			int resu=str1.compareTo(str2);
			System.out.println(resu);
			if(resu<=0)
			{
				System.out.println("\"" + str1 + "\"" +
		                " is less than " +
		                "\"" + str2 + "\"");
			}
			
			else if(resu==0)
			{
				System.out.println("\"" + str1 + "\"" +
		                " is equal to " +
		                "\"" + str2 + "\"");
			}
			
			else
			{
				System.out.println("\"" + str1 + "\"" +
		                " is greater than " +
		                "\"" + str2 + "\"");
			}
			
	}
	//contacting 2 String 
	public static void mainconcat(String[]args)
	{
		String str =new String();
		str="vinod"; String str1="Kumar";
		String str2=str.concat(str1);
		System.out.println(str2);
	}
}