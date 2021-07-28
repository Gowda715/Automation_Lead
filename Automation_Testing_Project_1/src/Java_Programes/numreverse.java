package Java_Programes;

public class numreverse {

	public static void main(String[] args) {
		int num = 11, reversed = 0;

	    while(num >0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	      if(reversed==num)
	      {
	    	  System.out.println("The numbe is pallidrome");
	      }
	      else
	      {
	    	  System.out.println("The number is not pallidrome");
	      }
	      
	    }
	    	
	    
	  }
			
	
	}


 