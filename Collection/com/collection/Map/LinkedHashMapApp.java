package com.collection.Map;
import java.util.*;
public class LinkedHashMapApp {
   public static void main(String[] args) {
	    LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer,String>();
	    lmap.put(2, "suresh");
        lmap.put(1, "rakesh");
        lmap.put(4,"sunil");
        lmap.put(3,"ganesh");
        lmap.put(5, "anil");
        
        
        //LinkedHashMap store the like as user given sequence
        Set<Map.Entry<Integer, String>> entryset = lmap.entrySet();
        for(Map.Entry<Integer, String> m:entryset) {
        	System.out.println(m.getKey()+"\t"+m.getValue());
        }
        
   }
} 
