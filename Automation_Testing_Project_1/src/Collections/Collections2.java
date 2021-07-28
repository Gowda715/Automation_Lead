package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collections2 {
public static void main(String[] args) {
	 HashMap<Integer,String> m=new HashMap<Integer,String>();//Creating HashMap      
     m.put(1,"Chris");  //Adding elements in Map    
     m.put(2,"Morris");      
     m.put(3,"Sam");     
     m.put(4,"Cruise");      
     System.out.println("Iterating Hashmap...");    
     for(Map.Entry me : m.entrySet()){      
      System.out.println(me.getKey()+" "+me.getValue());      
     }    
  }    
    
	
}
