package Strings;

import java.util.Arrays;

public class String2 {

	public static void main(String[] args) {
		String ar = "Vinodkumar";
		char[] sr = ar.toCharArray();
		System.out.println(sr);
		System.out.println(Arrays.toString(sr));
		String2.amain(args);
		String2.bmain();
		String2.cmain();

	}

	public static void amain(String[] args) {
		// Write a Java Program to Check whether the string is Anagram or not?
		String str = "mom";
		String str1 = "mom";
		str.toLowerCase();
		str1.toLowerCase();
		if (str.length() != str1.length()) {
			System.out.println("Both the Strings or anagram");
		} else {
			char[] l1 = str.toCharArray();
			char[] l2 = str1.toCharArray();
			//To be Continued for this program

		}

	}
	//Write a java Program to divide a string in to N equal parts
		public static void bmain()
		{
			String str="NewString";
			String[] ptr=str.split(" " );
			System.out.println(ptr);
		}
		
		public static void cmain()
		{
			String str="Autoreturn";
			int s1=str.codePointBefore(1);
			System.out.println(s1);
		}
}