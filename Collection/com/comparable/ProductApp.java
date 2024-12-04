package com.comparable;

import java.util.*;

public class ProductApp {
   public static void main(String[] args) {
	    ArrayList al  = new ArrayList();
	    al.add(new Product(1,"mobile",12000));
	    al.add(new Product(3,"laptop",60000));
	    al.add(new Product(5,"watch",500));
	    al.add(new Product(2,"charger",400));
	    al.add(new Product(4,"cable",100));
	    
	    System.out.println("Product list");
	    for(Object obj:al) {
	    	Product p = (Product) obj;
	    	System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
	    }
	    
	    Collections.sort(al);
	    
	    System.out.println("\nUpdated Product list");
	    for(Object obj:al) {
	    	Product p = (Product) obj;
	    	System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
	    }
	    
   }
}
