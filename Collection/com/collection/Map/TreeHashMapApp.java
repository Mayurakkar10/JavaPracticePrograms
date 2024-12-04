package com.collection.Map;
import java.util.*;
public class TreeHashMapApp {
    public static void main(String[] args) {
    	 TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
    	 
    	 tmap.put(10,"rakesh");
    	 tmap.put(1, "krushna");
    	 tmap.put(5,"jaya");
    	 tmap.put(2,"rajesh");
    	 tmap.put(6, "raja");
    	 
    	 //TreeMap store data in ascending order
    	 Set<Map.Entry<Integer, String>> entryset  = tmap.entrySet();
    	 for(Map.Entry<Integer,String> m : entryset) {
    		 System.out.println(m.getKey()+"\t"+m.getValue());
    	 }
    	 
    }
}
