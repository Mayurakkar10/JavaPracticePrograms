package CollectionNew.IterableInteface;
import java.util.*;
public class IteratorMethod {
      public static void main(String[] args) {
    	  ArrayList al = new ArrayList();
    	     al.add(10);
    	     al.add(20);
    	     al.add(30);
    	     al.add(40);
    	     al.add(50);
    	     
    	    Iterator i = al.iterator();
    	    while(i.hasNext()==true) {
    	    	System.out.println(i.next());
    	    	i.remove();
    	    }
      }
}
