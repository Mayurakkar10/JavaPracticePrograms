package WaysToFetchDataFromCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
     public static void main(String[] args) {
    	  ArrayList al = new ArrayList();
    	  al.add(10);
    	  al.add(20);
    	  al.add(30);
    	  al.add(40);
    	  al.add(50);
    	  
          //Iterator - it is used fetch data from collection in forward direction only
    	  //Iterator can work with legacy collection as well as non legacy collection
    	  //methods of Iterator 
    	  //hasNext() - check for element is present or not;
    	  //next() - fetch element from collection and move cursor to the next
    	  //remove() - used to remove element from collection
    	  Iterator i = al.iterator();
    	  while(i.hasNext()) {
    		  Object obj  = i.next();
    		  if((int)obj==10) {
    			  i.remove(); 
    		  }
    	  }
    	  System.out.println("After deleteing collection: "+al);
     }
}
