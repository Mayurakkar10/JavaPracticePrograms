package CollectionNew.TypesOfCollection.List;
import java.util.*;
public class ListApp {
      public static void main(String[] args) {
    	    ArrayList al = new ArrayList();
    	    
    	    //add() method is used to add element in collection
    	    al.add(10);
    	    al.add(20);
    	    al.add(30);
    	    
    	    
    	    //E get() method is used to get data from collection  
    	    Object obj = al.get(0);
    	    System.out.println(obj);
    	    
    	    //E set(int E) method set the data or update the data
    	    al.set(0, 40);
    	    System.out.println(al);
    	    
    	    //int indexOf() this method can return index of element 1 and return -1 when element is not found
    	    //used for searching in collection
            int find = al.indexOf(70);
            if(find != -1) {
            	System.out.println("Element found");
            }
            else
            {
            	System.out.println("Element not found");
            }
    	    

      }
}

//List collection can store any type of data in it and it can allow duplicated element and 
//manage data using indexing technique


