package com.collection;
import java.util.*;
public class IteratorInterface {
   public static void main(String[] args) {
	    ArrayList al  = new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    Iterator i = al.iterator();
	    
	    while(i.hasNext()) {
	      Object obj = i.next();
	      System.out.println(obj);
	    }
   }
}
