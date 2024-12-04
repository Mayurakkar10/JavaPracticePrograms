package com.collection;
import java.util.*;
public class ArrayListApp {
   public static void main(String x[])
   {
	   ArrayList al = new ArrayList();
	   al.add(100);
	   al.add(200);
	   
	   // isEmpty()
	   boolean b = al.isEmpty();
	   if(b)
	   {
		   System.out.println("The ArrayList is empty");
	   }
	   else
	   {
		   System.out.println("The ArrayList is not empty");
	   }
	   
	   // contains()
	   boolean b1 = al.contains(100);
	   if(b1)
	   {
		   System.out.println("Value is present in collection");
	   }
	   else
	   {
		   System.out.println("Value is not presnt in collection");
	   }
	   
	   //iterator()
	   Iterator i = al.iterator(); 
	    while(i.hasNext()) {
	      Object obj = i.next();
	      System.out.println(obj);
	    }
	   
	   // size();
	   int s = al.size();
	   System.out.println(al);
	   System.out.println("size of collection: "+s);
   }
}
