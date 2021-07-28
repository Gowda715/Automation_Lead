package Strings;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		String str=("Vinod");
		String rev="";
		int leng=str.length();				//this class declares 3 methods of string reverse
		for(int i=leng-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
			System.out.println(rev);
			String_reverse.amain(args);
			String_reverse.bmain(args);

	}
	public static void amain(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String sr=sc.next();
		StringBuffer str=new StringBuffer(sr);
		str.reverse();
		System.out.println(str);
	}
		public static void bmain(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string to reverse");
			String sr=sc.next();
			String rev="";
			int leng=sr.length();
			for(int i=leng-1; i>=0; i--)
			{
				rev=rev+sr.charAt(i);
			}
			
				System.out.println(rev);
		}
}		
