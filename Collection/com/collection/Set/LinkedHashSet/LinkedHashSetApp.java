package com.collection.Set.LinkedHashSet;
import java.util.*;
public class LinkedHashSetApp {
   public static void main(String[] args)
   {
	   LinkedHashSet lh = new LinkedHashSet();
	   lh.add(50);
	   lh.add(40);
	   lh.add(10);
	   lh.add(20);
	   lh.add(70);
	   lh.add(70);
	   
	   for(Object obj:lh) {
		   System.out.println(obj);
	   }
   }
}
