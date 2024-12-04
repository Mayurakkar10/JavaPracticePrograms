package com.Map;
import java.util.*;
public class DepartmentAppUsingMapWithinMap {
     public static void main(String[] args) {
    	  LinkedHashMap<String,LinkedHashMap<Integer,String>> dept= new LinkedHashMap<>();
    	  
    	  LinkedHashMap<Integer,String> fe = new LinkedHashMap<>();
    	  fe.put(1,"Suresh");
    	  fe.put(2, "rakesh");
    	  fe.put(3, "hemant");
    	  
    	  LinkedHashMap<Integer,String> se  =new LinkedHashMap<>();
    	  se.put(1, "sunil");
    	  se.put(2, "anil");
    	  se.put(3, "nitin");
         
    	  dept.put("FE",fe);
    	  dept.put("SE", se);
    	  
    	  Set<Map.Entry<String, LinkedHashMap<Integer,String>>> entryset = dept.entrySet();
    	  for(Map.Entry<String, LinkedHashMap<Integer,String>> m:entryset) {
    		  String key = m.getKey();
    		  System.out.println("========="+key+"==========");
    		  LinkedHashMap<Integer,String> setData= m.getValue();
    		  Set<Map.Entry<Integer, String>> showData = setData.entrySet();
    		  for(Map.Entry<Integer, String> ma:showData) {
    			  System.out.println(ma.getKey()+"\t"+ma.getValue());
    		  }
    	  }
     }
}
