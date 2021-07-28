package Java_Programes;

import java.util.Scanner;

public class odd_even 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The number is odd");
		}
		
		else
		{
			System.out.println("Then number is even");
		}
				odd_even.amain(args);
	}
		//Checking the Factorial of a number
		public static void amain(String[]args)
		{
			int C, Fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to get factorial value");
			int num=sc.nextInt();
			if(num>0)
			{
				System.out.println("The number should be double");
			}
			
			else
			{
				for(C=1; C<=1; C++)
				{
					Fact=Fact*C;
				}
					
			}
				System.out.println(Fact);
		}
		
}
