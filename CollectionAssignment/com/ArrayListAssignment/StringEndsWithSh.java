package com.ArrayListAssignment;
import java.util.*;
public class StringEndsWithSh {
       public static void main(String[] args) {
    	   ArrayList al = new ArrayList();
    	   al.add("rakesh");
    	   al.add("suresh");
    	   al.add("jayesh");
    	   al.add("Sagar");
    	   
    	    for(Object obj:al) {
    	    	String s = (String)obj;
    	    	if(s.startsWith("s")==true|| s.startsWith("r")==true && s.endsWith("sh")==true){
    	    		System.out.println(obj);
    	    	}
    	    }
       }
}

