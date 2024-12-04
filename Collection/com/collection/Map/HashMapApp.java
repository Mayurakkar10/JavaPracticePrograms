package com.collection.Map;
import java.util.*;
public class HashMapApp {
     public static void main(String[] args) {
    	  HashMap<Integer, String> map = new HashMap<Integer,String>();
    	  
    	  
    	  //insertion
    	  //HashMap store the data in random sequence
    	  map.put(2, "def");
    	  map.put(3, "aakash");
    	  map.put(44, "jayesh");
    	  map.put(1, "abc");
    	  map.put(4, "rakesh");
    	  System.out.println(map);
    	  
    	  System.out.println(map.get(1));
    	  map.get(1);
    	  
    	  
    	 //traverse through map
    	 Set<Map.Entry<Integer,String>> entryset = map.entrySet();
         for(Map.Entry<Integer, String> m: entryset) {
        	 System.out.println(m.getKey()+"\t"+m.getValue());
         }
    	  
//    	  if(map.containsKey(10)==true) {
//    		  System.out.println("\nkey is present");
//    	  }
//    	  else {
//    		  System.out.println("not present");
//    	  }
    	  
     }
}
