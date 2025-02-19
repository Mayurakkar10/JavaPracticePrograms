package WaysToFetchDataFromCollection;
import java.util.*;
public class UsingForEachLoop {
   public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    al.add(50);
	    
	    //jdk 1.5 version provide  forEach loop used to fetch data from collection works in forward direction
//	    for(Object obj:al) {
//	    	System.out.println(obj);
//	    }
	    
	    //jdk 1.8  forEach loop
	    al.forEach(value->System.out.println(value));
   }
}
