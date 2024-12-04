package com.VectorAssignment;

import java.util.*;

public class VectorApp {
   public static void main(String[] args)
   {
	    Vector v = new Vector();
	    Scanner sc = new Scanner(System.in);
	    do {
	      System.out.println("\n1.Add new Element");
	      System.out.println("2.View All Element");
	      System.out.println("3.Search Element by contains() method");
	      System.out.println("4.Search Element by indexOf() method");
	      System.out.println("5.remove Element");
	      System.out.println("6.Replace Element");
	      
	      System.out.println("\nEnter choice: ");
	      int choice = sc.nextInt();
	      switch(choice)
	      {
	      case 1:System.out.println("\nEnter Element");
	             int value = sc.nextInt();
	             boolean b=v.add(value);
	             if(b)
	             {
	            	 System.out.println("Element Added..\n");
	             }
	             else
	             {
	            	 System.out.println("Some problem is there...\n");
	             }
	             break;
	      case 2:Iterator i = v.iterator();
	             while(i.hasNext())
	             {
	            	 Object obj = i.next();
	            	 System.out.println(obj);
	             }
	             break;
	      case 3:System.out.println("\nEnter value to Search: ");
	             int  svalue = sc.nextInt();
	             boolean a = v.contains(svalue);
	             if(a)
	             {
	            	 System.out.println("Value found "+svalue);
	             }
	             else
	             {
	            	 System.out.println("Value not found");
	             }
	             break;
	      case 4:System.out.println("\nEnter value to Search: ");
                 int searchValue = sc.nextInt();
                 int index = v.indexOf(searchValue);
                 
                 if(index!=-1)
                 {
         	       System.out.println("Value found "+searchValue);
                 }
                 else
                 {
                	 System.out.println("Value not found");
                 }
                 break;
	      case 5:System.out.println("\nEnter Element to Remove: ");
	             int elem = sc.nextInt();
	             int removeIndex= v.indexOf(elem);
	             if(removeIndex!=-1)
	             {
	            	  v.remove(removeIndex);
	            	  System.out.println("Element deleted");
	             }
	             else
	             {
	            	 System.out.println("Element not found");
	             }
	             break;
	      case 6:System.out.println("\nEnter value to change: ");
	             int oldElem = sc.nextInt();
	             int updatedIndex = v.indexOf(oldElem);
	             
	             if(updatedIndex!=-1)
	             {
	            	System.out.println("\nEnter new Element: ");
	            	int newElem = sc.nextInt();
	            	v.set(updatedIndex, newElem);
	            	System.out.println("\nElement updated...");
	             }
	             break;
	         default:
	        	 System.out.println("Invalid choice");
	      }
	    }while(true);
   }
}
