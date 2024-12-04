package com.collection;

import java.util.*;


//Collection.max()
//Collection.min();
//Collection.reverse();
//Collection.synchronizedList()
public class CollectionMethods {
    public static void main(String[] args){
    	 ArrayList al = new ArrayList();
    	 al.add(100);
    	 al.add(50);
    	 al.add(60);
    	 al.add(70);
    	 al.add(40);
    	 
    	 System.out.println("Display list");
    	 for(Object obj:al) {
    		 System.out.println(obj);
    	 }
    	 Object objMax = Collections.max(al);
    	 Object objMin = Collections.min(al);
    	 Collections.reverse(al);
    	 
    	 System.out.println("Reversed Collection: ");
    	 for(Object obj:al){
    		 System.out.println(obj);
    	 }
    	 
    	 System.out.println("max: "+objMax+" min: "+objMin);
    	 
    	 List list1 = Collections.synchronizedList(al);
    	 System.out.println(list1);
    	 
    	 
    	 System.out.println("Sorted List");
    	 Collections.sort(al);
    	 for(Object obj: al) {
    		 System.out.println(obj);
    	 }
    }
}
