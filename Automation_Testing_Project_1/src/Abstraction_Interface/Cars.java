package Abstraction_Interface;

class Benz 
{
	public void add(int i, int j) {
		System.out.println(i + j);
	}
	
	public void mutiply(int i, int j)
	{
		System.out.println(i*j);
	}
	
	public void divide(int i, int j)
	{
		System.out.println(i/j);
	}

}
	public class Cars
	{
		public static void main(String[]args)
		{
			Benz ben=new Benz();
			ben.add(5, 10);
			ben.mutiply(5, 10);
			ben.divide(5, 10);
		}
	}