package WaysToFetchDataFromCollection;

import java.util.*;

public class UsingEnumeration {
	public static void main(String[] args) {
     //Enumeration is cursor in java which is used fetch data from collection
	  Vector v = new Vector();
	  v.add(10);
	  v.add(20);
	  v.add(30);
	  v.add(40);
	  v.add(50);
	   
	  //fetch data using enumeration
	  //enumeration can work with legacy class only
	  //enumeration is read only  that means we can not modify any data from collection 
	  //method of enumeration
	  //boolean hasMoreElements() - this method is used to check element is present in collection or not
	  //boolean nextElement() - this collection can fetch data from collection and move cursor to next element
	  Enumeration enm = v.elements();
	  while(enm.hasMoreElements()) {
		  Object obj = enm.nextElement();
		  System.out.println(obj);
	  }
	  
	  
	}
}
