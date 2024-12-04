package com.collection.ListCollection;

import java.util.*;

public class ListCollection {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  ArrayList al  = new ArrayList();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  
	  //get();
	  //Object obj  = al.get(1);
	  //System.out.println(obj);
	  
	  //set()
	  
	  int index = 1;
	  int newValue = 500;
	  al.set(index,newValue);
	  
	  
	  //add()
	  //al.add(2,100);
	  
	  //remove
	  //al.remove(3);
	  
	  for(Object obj3:al) {
		  System.out.println(obj3);
	  }
	  
	  //indexOf()
	  int index1 = al.indexOf(500);
	  if(index1!=-1)
	  {
		  al.remove(index1);
		  System.out.println("Element deleted");
	  }
	  else
	  {
		  System.out.println("index not found");
	  }
	  
	  for(Object obj3:al) {
		  System.out.println(obj3);
	  }
	  
	  
  }
}
