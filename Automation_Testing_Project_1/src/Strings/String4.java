package Strings;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {

		{
			int m, n, sum = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the number:");
			m = s.nextInt();
			while (m > 0) {
				n = m % 10;
				sum = sum + n;
				m = m / 10;
			}
			System.out.println("Sum of Digits:" + sum);
			String4.cmain(args);
		}
	}
	public static void cmain(String[]args)
	{
		String str="12222";
		int num=Integer.parseInt(str);
		int rem, sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The sum of digits in this string is :" +sum);
	}
}
