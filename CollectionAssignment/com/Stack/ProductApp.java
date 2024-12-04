package com.Stack;
import java.util.*;
import java.time.LocalDate;
public class ProductApp {
    public static void main(String[] args)
    {
    	Stack s = new Stack();
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> datestring=new ArrayList<String>();
    	LocalDate  ld = LocalDate.now();
    	do {
    		System.out.println("1.Add New Product");
    		System.out.println("2.View all Product");
    		System.out.println("3.View product using expiry Date");
    		System.out.println("4.Delete product using expiry Date");
    		
    		System.out.println("\nEnter choice: ");
    		int choice = sc.nextInt();
    		
    		switch(choice)
    		{
    		case 1: System.out.println("\nEnter product id,name,price,expiryDate of Product: ");
    		        int id = sc.nextInt();
    		        String name = sc.next();
    		        int price = sc.nextInt();
    		        String expDate = sc.next();
    		       
    		        s.add(new Product(id,name,price,expDate));
    		        datestring.add(expDate);
    		        break;
    		case 2: for(Object obj:s)
	    		    {
	    			  Product p = (Product)obj;
	    			  System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+p.getExpDate()+"\n");
	    		    }
    		        break;
    		case 3: for(Object obj:s)
    		        {
    			       Product p = (Product)obj;
    			       System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+datestring+" ");
    		        }
    		        break;
    		}
    		
    	}while(true);
    	
    }
}
