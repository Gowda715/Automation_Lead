package Java_Programes;

public class ArrayList {

	public static void main(String[] args) {
		int a[]={1,2,3,4,1,2};
        for(int i=0; i<a.length; i++)
            {
                for( int j=i+1; j<a.length; j++)
                {
                    if(a[i]==a[j])
                    {
                        
                        return;
                        
                    }
                    
                    System.out.println("Arrays has duplicate element");
                    System.out.println("Arrays do not have duplicate element");
            }
     }

	

	}
}
