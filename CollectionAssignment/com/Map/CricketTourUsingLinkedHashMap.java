package com.Map;
import java.util.*;
public class CricketTourUsingLinkedHashMap {
     public static void main(String[] args) {
    	   LinkedHashMap<String,ArrayList<String>> lmap = new LinkedHashMap<String,ArrayList<String>>();
    	   
    	   ArrayList<String> ind = new ArrayList<String>();
    	   ind.add("Dhoni");
    	   ind.add("Virat");
    	   ind.add("Rohit");
    	   
    	   ArrayList<String> aus = new ArrayList<String>();
    	   aus.add("head");
    	   aus.add("warner");
    	   aus.add("steve");
    	   
    	   lmap.put("India",ind);
    	   lmap.put("Australia",aus);
    	   
    	   Set<Map.Entry<String, ArrayList<String>>> entryset = lmap.entrySet();
    	   for(Map.Entry<String, ArrayList<String>> m:entryset) {
    		  String key=m.getKey();
    		  System.out.println("========="+key+"===========");
    		  ArrayList<String> alist=m.getValue();
    		  
    		  for(String data:alist) {
    			  System.out.println(data);
    		  }
    		  
    	   }
     }
}
