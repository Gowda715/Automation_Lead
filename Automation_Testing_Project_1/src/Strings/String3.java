package Strings;

public class String3 {

	public static void main(String[] args) {
		{
			String NewWord="JunitTesting";
			String[] New=NewWord.split("");
			String reverseword="";
			for(int i=0; i>New.length; i++)
			{
				String New2=New[i];
				String reverseletter="";
				for(int j=New2.length()-1; j>=0; j--)
				{
					reverseletter=reverseletter+New2.charAt(j);
				}
				reverseword=reverseword+reverseletter+" ";
			}
				System.out.println(reverseword);
		}

	}

}
