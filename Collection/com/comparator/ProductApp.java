package com.comparator;

import java.util.*;

public class ProductApp {
    public static void main(String[] x) {
    	ArrayList al = new ArrayList();
    	al.add(new Product(1,"mobile",12000));
    	al.add(new Product(3,"laptop",600000));
    	al.add(new Product(5,"charger",400));
    	al.add(new Product(2,"cable",100));
    	al.add(new Product(4,"earphone",500));
    	
    	System.out.println("\nProduct list: ");
    	for(Object obj:al)
    	{
    		Product p = (Product)obj;
    		System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
    	}
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\n1.SortProductById ");
    	System.out.println("\n2.SortProductByName ");
    	System.out.println("\n3.SortProductByPrice");
    	System.out.println("\nEnter choice");
    	int choice = sc.nextInt();
    	switch(choice)
    	{
    	case 1:  SortProductById  prodById = new SortProductById();
    	         Collections.sort(al,prodById);
    	         break;
    	case 2:  SortProductByName prodByName = new SortProductByName();
    	         Collections.sort(al,prodByName);
    		    break;
    	case 3: SortProductByPrice prodByPrice = new SortProductByPrice();
    	        Collections.sort(al,prodByPrice);
    	        break;  
    	}
    	
         System.out.println("Updatead Product List");    	
    	 for(Object obj:al)
     	 {
     		Product p = (Product)obj;
     		System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
     	 }
    	
    }
}
