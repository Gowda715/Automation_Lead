package Exceptions;

public class E1 {

	public static void main(String[] args) {
		final int i = 20;
		int c = 23;
		int b = c + i;
		System.out.println(b);
		cmain();

	}
		public static void cmain()
		{
			int i=20;
			try
			{
				int k=i/10;
			}
			catch(ArithmeticException e)
			{
				System.out.println("This is excuted in this block");
			}
			
			finally
			{
				System.out.println("please excute even after this is exctuted");
			}
		}
}
