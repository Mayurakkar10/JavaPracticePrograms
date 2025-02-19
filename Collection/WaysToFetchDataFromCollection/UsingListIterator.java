package WaysToFetchDataFromCollection;

import java.util.*;

public class UsingListIterator {
     public static void main(String[] args) {
    	   ArrayList al = new ArrayList();
    	   al.add(10);
    	   al.add(20);
    	   al.add(30);
    	   al.add(40);
    	   al.add(50);
    	   
    	   //ListIterator is used to fetch data from collection from forward as well as backward direction
    	   //method of ListIterator
    	   //boolean hasNext() - check element is present in collection or not;
    	   //boolean next()  - fetch data from collection and move cursor to the next;
    	   //hasPrevious() - check element is present in collection or not
    	   //previous();  - fetch data from collection and move cursor to the next
    	   //remove(); - remove is used to remove data from collection
    	   //add();  - add is used to add into collection
    	   //set();  - set is used to update  any element in the collection
    	   
    	   
    	   //fetch data in forward
//    	   ListIterator fi = al.listIterator();
//    	   while(fi.hasNext()) {
//    		    Object obj = fi.next();
//                System.out.println(obj);
//    	   }
    	   
    	   //fetch data in backword
    	   ListIterator bi = al.listIterator(al.size());
    	   while(bi.hasPrevious()){
    		   Object obj = bi.previous();
    		   if((int)obj == 40) {
    			   bi.add(80);
    		   }
    	   }
    	   System.out.println("After adding collection is: "+al);
    	   
    	   
     }
}
